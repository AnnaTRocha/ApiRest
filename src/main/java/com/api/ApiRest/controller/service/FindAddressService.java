package com.api.ApiRest.controller.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.ApiRest.model.Address;
import com.api.ApiRest.model.repository.AddressRepository;

@Service
public class FindAddressService {
	
	@Autowired
	private AddressRepository addressRepository;
	
	public List<Address> findAllAddress(){
		return addressRepository.findAll();
	}
	
	public Address findAddressById(Long id){
		Optional<Address> addressOptional = addressRepository.findById(id);
		Address address = null;
		
		if (!addressOptional.isPresent()) {
			System.out.println("Optional isn't present");
		} else {
			address = addressOptional.get();
		}
		
		return address;
	}
	
	public void deleteAddress(Long id) {
		Optional<Address> addressOptional = addressRepository.findById(id);
		
		if (!addressOptional.isPresent()) {
			System.out.println("Optional isn't present");
		} else {
			addressRepository.deleteById(id);
		}
	}
	
}
