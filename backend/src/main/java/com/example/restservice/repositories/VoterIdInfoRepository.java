package com.example.restservice.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.restservice.entities.VoterIdInfo;

public interface VoterIdInfoRepository extends CrudRepository<VoterIdInfo, String>{
    
}