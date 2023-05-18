package com.example.restservice.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.restservice.entities.VoterIdInfo;

public interface VoterIdInfoRepository extends CrudRepository<VoterIdInfo, String>{

    void save(String string, String string2, String string3, int i);
    
}