package com.example.restservice.services;

    import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.restservice.entities.SlotAvail;

    @Service
    public class AvailabilityService {
      
        private List<SlotAvail> slots= Arrays.asList(new SlotAvail(7.5, 10), new SlotAvail(8.0, 5));
        public List<SlotAvail> getSlots(){
            
            return slots;
        }
    }
       

