package com.example.restservice.models;

public class Phone {
    private Long phoneNumber;
    private Integer otp;

    public Phone() {
    }

    public Integer getOtp() {
        return otp;
    }

    public void setOtp(Integer otp) {
        this.otp = otp;
    }

    public Phone(Long phoneNumber, Integer otp) {
        this.phoneNumber = phoneNumber;
        this.otp = otp;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
}
