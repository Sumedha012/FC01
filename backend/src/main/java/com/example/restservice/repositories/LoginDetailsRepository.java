package com.example.restservice.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.restservice.entities.LoginDetails;

public interface LoginDetailsRepository extends CrudRepository<LoginDetails, Long>{
    
}