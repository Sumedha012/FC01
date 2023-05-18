package com.example.restservice.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.restservice.entities.LoginDetails;
import com.example.restservice.entities.VoterIdInfo;
import com.example.restservice.repositories.LoginDetailsRepository;
import com.example.restservice.repositories.VoterIdInfoRepository;

@Service
public class GenerateOtpService{
    
    @Autowired
    private LoginDetailsRepository loginDetailsRepository;
    @Autowired
    private VoterIdInfoRepository voterIdInfoRepository;

    public boolean generateOtp(Long phonenumber){
        if(!isPhoneNumberValid(phonenumber) || !phoneNumberPresent(phonenumber)){
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
    private boolean phoneNumberPresent(Long phonenumber){
        List<VoterIdInfo> voterIdInfoList = (List<VoterIdInfo>) voterIdInfoRepository.findAll();
        for(int i=0; i< voterIdInfoList.size(); i++){
            if(voterIdInfoList.get(i).getPhoneNumber().equals(phonenumber)){
                return true;
            }
        }
        return false;
    }
}