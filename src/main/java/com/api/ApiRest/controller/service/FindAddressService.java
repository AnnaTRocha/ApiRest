package com.api.ApiRest.controller.service;

import java.util.List;

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
}
