package com.example.restservice.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.restservice.entities.BookSlot;
import com.example.restservice.entities.SlotAvail;
import com.example.restservice.repositories.BookSlotRepository;
import com.example.restservice.repositories.SlotAvailRepository;

@Service
public class BookingService {
    @Autowired
    SlotAvailRepository slotAvailRepository;
    @Autowired
    BookSlotRepository bookSlotRepository;

    public boolean slotBooking(BookSlot bookSlot){
        
        SlotAvail slotAvail= slotAvailRepository.findById(bookSlot.getSlotStartTime()).orElse(null);
        if(slotAvail.getAvailability()==0)
        {
           return false;
        }
        slotAvail.setAvailability(slotAvail.getAvailability()-1);
        slotAvailRepository.save(slotAvail);
        bookSlotRepository.save(bookSlot);
        
        return true;
    }
}
