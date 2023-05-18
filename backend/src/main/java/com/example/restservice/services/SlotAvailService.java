package com.example.restservice.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.restservice.entities.SlotAvail;
import com.example.restservice.repositories.SlotAvailRepository;

@Service
public class SlotAvailService {
    
    @Autowired
    private SlotAvailRepository slotAvailRepository;

    public void initialize()
    {
        slotAvailRepository.save(new SlotAvail(7.0,10));
        slotAvailRepository.save(new SlotAvail(8.0,10)); 
        slotAvailRepository.save(new SlotAvail(9.0,10));
        slotAvailRepository.save(new SlotAvail(10.0,10));
        slotAvailRepository.save(new SlotAvail(11.0,10));
        slotAvailRepository.save(new SlotAvail(12.0,10));
        slotAvailRepository.save(new SlotAvail(13.0,10)); 
        slotAvailRepository.save(new SlotAvail(14.0,10));
        slotAvailRepository.save(new SlotAvail(15.0,10));
        slotAvailRepository.save(new SlotAvail(16.0,10));
        slotAvailRepository.save(new SlotAvail(17.0,10));

    
    }
}
