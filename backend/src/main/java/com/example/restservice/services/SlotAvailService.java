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
        slotAvailRepository.save(new SlotAvail(7,10));
        slotAvailRepository.save(new SlotAvail(8,10)); 
        slotAvailRepository.save(new SlotAvail(9,10));
        slotAvailRepository.save(new SlotAvail(10,10));
        slotAvailRepository.save(new SlotAvail(11,10));
        slotAvailRepository.save(new SlotAvail(12,10));
        slotAvailRepository.save(new SlotAvail(13,10)); 
        slotAvailRepository.save(new SlotAvail(14,10));
        slotAvailRepository.save(new SlotAvail(15,10));
        slotAvailRepository.save(new SlotAvail(16,10));
        slotAvailRepository.save(new SlotAvail(17,10));

    
    }
}
