package com.api.ApiRest.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.ApiRest.model.Address;

public interface AddressRepository extends JpaRepository<Address, Long>{

}
