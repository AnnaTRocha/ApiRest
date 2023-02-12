package com.api.ApiRest.controller.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.ApiRest.model.repository.AddressRepository;
import com.api.ApiRest.model.resource.AddressResource;

@Service
public class SaveAddressService {

	@Autowired
	private AddressRepository addressRepository;
	
	@Autowired
	private ConversorAddressService service;
	
	public void saveAddress(AddressResource address) {
		addressRepository.saveAndFlush(service.conversor(address));
	}
	
}
