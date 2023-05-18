package com.example.restservice.services;

import org.springframework.stereotype.Service;

import com.example.restservice.entities.BookSlot;

@Service
public class BookingService {
    
    public boolean slotBooking(BookSlot bookSlot){
        System.out.println(bookSlot.getVoterId());
        System.out.println(bookSlot.getSlotStartTime());
        return true;
    }
}
