package com.example.restservice.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class SlotAvail {

    @Id
    private int slotStartTime;
    private int availability;
    
    public int getSlotStartTime() {
        return slotStartTime;
    }
    public void setSlotStartTime(int slotStartTime) {
        this.slotStartTime = slotStartTime;
    }
    public int getAvailability() {
        return availability;
    }
    public SlotAvail() {
    }
    public SlotAvail(int slotStartTime, int availability) {
        this.slotStartTime = slotStartTime;
        this.availability = availability;
    }
    public void setAvailability(int availability) {
        this.availability = availability;
    }
    
    

}
