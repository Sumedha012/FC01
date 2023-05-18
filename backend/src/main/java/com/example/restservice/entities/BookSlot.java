package com.example.restservice.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class BookSlot {
    
    @Id
    private String voterId;
    public BookSlot(String voterId, Double slotStartTime) {
        this.voterId = voterId;
        this.slotStartTime = slotStartTime;
    }
    private Double slotStartTime;
    
    public BookSlot() {
    }
    public String getVoterId() {
        return voterId;
    }
    public void setVoterId(String voterId) {
        this.voterId = voterId;
    }
    public Double getSlotStartTime() {
        return slotStartTime;
    }
    public void setSlotStartTime(Double slotStartTime) {
        this.slotStartTime = slotStartTime;
    }
    
}
