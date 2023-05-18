package com.example.restservice.services;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.restservice.entities.SlotAvail;
import com.example.restservice.repositories.SlotAvailRepository;

@Service
public class AvailabilityService {
    @Autowired
    private SlotAvailRepository slotAvailRepository;
      
    public List<SlotAvail> getSlots(){
        List<SlotAvail> slots = (List<SlotAvail>) slotAvailRepository.findAll();
        return slots;
    }
}
       

