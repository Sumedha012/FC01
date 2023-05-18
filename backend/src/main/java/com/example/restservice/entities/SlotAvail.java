package com.example.restservice.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class SlotAvail {

    @Id
    private Double slotStartTime;
    private int availability;
    
    public Double getSlotStartTime() {
        return slotStartTime;
    }
    public void setSlotStartTime(Double slotStartTime) {
        this.slotStartTime = slotStartTime;
    }
    public int getAvailability() {
        return availability;
    }
    public SlotAvail() {
    }
    public SlotAvail(Double slotStartTime, int availability) {
        this.slotStartTime = slotStartTime;
        this.availability = availability;
    }
    public void setAvailability(int availability) {
        this.availability = availability;
    }
    
    

}
