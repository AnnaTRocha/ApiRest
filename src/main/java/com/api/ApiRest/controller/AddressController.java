package com.api.ApiRest.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.ApiRest.controller.service.FindAddressService;
import com.api.ApiRest.controller.service.SaveAddressService;
import com.api.ApiRest.model.Address;
import com.api.ApiRest.model.repository.AddressRepository;
import com.api.ApiRest.model.resource.AddressResource;

@RestController
@RequestMapping(value = "api")
public class AddressController {

	@Autowired
	private AddressRepository addressRepository;
	
	@Autowired
	private FindAddressService findAddressService;
	
	@Autowired
	private SaveAddressService saveAddressService;
	
	@GetMapping(path = "/address-id/{id}")
	private Optional<Address> findAddressById(
			@PathVariable(name = "id", required = true) Long id){
		return addressRepository.findById(id);
	}	
	
	@GetMapping(path = "/address")
	private List<Address> findAllAddress(){
		return findAddressService.findAllAddress();
	}
	
	@PostMapping(path = "address-save")
	public void saveAddress(@RequestBody AddressResource address) {
		saveAddressService.saveAddress(address);
	}
	
	@DeleteMapping(path = "address-delete-id/{}")
	public void deleteAddress(
			@PathVariable(name = "id", required = true) Long id) {
		addressRepository.deleteById(id);
	}
	
}
