package com.api.ApiRest.controller.service;

import org.springframework.stereotype.Component;

import com.api.ApiRest.model.Address;
import com.api.ApiRest.model.resource.AddressResource;

@Component
public class ConversorAddressService {
	
	public Address conversor(AddressResource addressResource) {
		
		Address address = new Address();
		address.setId(Long.parseLong(addressResource.getId()));
		address.setCity(addressResource.getCity());
		address.setCep(addressResource.getCep());
		return address;
		
	}
	
}
