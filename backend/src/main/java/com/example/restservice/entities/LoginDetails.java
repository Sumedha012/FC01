package com.example.restservice.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class LoginDetails{

    @Id
    private Long phonenumber;
    private int otp;

    public LoginDetails(Long phonenumber, int otp){
        this.phonenumber=phonenumber;
        this.otp=otp;
    }

    public Long getPhonenumber() {
        return phonenumber;
    }

    public LoginDetails() {
    }

    public void setPhonenumber(Long phonenumber) {
        this.phonenumber = phonenumber;
    }

    public int getOtp() {
        return otp;
    }

    public void setOtp(int otp) {
        this.otp = otp;
    }

}