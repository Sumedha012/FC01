package com.example.restservice.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class BookSlot {
    
    @Id
    private String voterId;
    public BookSlot(String voterId, int slotStartTime) {
        this.voterId = voterId;
        this.slotStartTime = slotStartTime;
    }
    private int slotStartTime;
    
    public BookSlot() {
    }
    public String getVoterId() {
        return voterId;
    }
    public void setVoterId(String voterId) {
        this.voterId = voterId;
    }
    public int getSlotStartTime() {
        return slotStartTime;
    }
    public void setSlotStartTime(int slotStartTime) {
        this.slotStartTime = slotStartTime;
    }
    
}
