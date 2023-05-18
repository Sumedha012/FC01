package com.example.restservice.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.restservice.entities.LoginDetails;
import com.example.restservice.repositories.LoginDetailsRepository;

@Service
public class SigninService {
    @Autowired
    private LoginDetailsRepository loginDetailsRepository;
    
    public boolean logIn(Long phoneNumber, int otp){
        LoginDetails loginDetails = loginDetailsRepository.findById(phoneNumber).orElse(null);
        
        if (loginDetails != null && loginDetails.getOtp() == otp)
            return true;

        return false;
}
}