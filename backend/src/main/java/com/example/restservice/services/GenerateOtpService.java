package com.example.restservice.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.restservice.entities.LoginDetails;
import com.example.restservice.repositories.LoginDetailsRepository;

@Service
public class GenerateOtpService{
    
    @Autowired
    private LoginDetailsRepository loginDetailsRepository;

    public boolean generateOtp(Long phonenumber){
        if(!isPhoneNumberValid(phonenumber)){
            return false;
        }
        int otp=(int)Math.floor(Math.random() * 9999);
        if (otp < 1000){
            otp += 1000;
        }
        loginDetailsRepository.save(new LoginDetails(phonenumber, otp));
        return true;
    }
    private boolean isPhoneNumberValid(Long phonenumber){
        if(phonenumber>=1000000000L && phonenumber<=9999999999L)
            return true;
        return false;
    }
}