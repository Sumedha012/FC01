package com.example.restservice.entities;

@Entity
public class VoterIdInfo {

    @Id
    private String voterId;
    private Long phoneNumber;
    private String name;
    private int wardNumber;
    
    public String getVoterId() {
        return voterId;
    }
    
    public VoterIdInfo() {
    }

    public VoterIdInfo(String voterId, Long phoneNumber, String name, int wardNumber) {
        this.voterId = voterId;
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.wardNumber = wardNumber;
    }
    public void setVoterId(String voterId) {
        this.voterId = voterId;
    }
    public Long getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getWardNumber() {
        return wardNumber;
    }
    public void setWardNumber(int wardNumber) {
        this.wardNumber = wardNumber;
    }
    
}
