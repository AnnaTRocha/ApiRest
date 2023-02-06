package com.api.ApiRest.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.ApiRest.model.People;

public interface PeopleRepository extends JpaRepository<People, Long>{

}
