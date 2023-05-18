package com.example.restservice.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.restservice.repositories.VoterIdInfoRepository;
import com.example.restservice.entities.VoterIdInfo;

@Service
public class VoterIdInfoService {

    @Autowired
    private VoterIdInfoRepository voterIdInfoRepository;

    public void initialize()
    {
        voterIdInfoRepository.save("ABC123456","9876543210L","Ram",5);
        voterIdInfoRepository.save("ABC232425","9234567890L","Sham",5);
        voterIdInfoRepository.save("ABC121314","9444495555L","Nikhila",5);
        voterIdInfoRepository.save("ABC313233","9121314151L","Riya",5);
        voterIdInfoRepository.save("ABC414243","9212223242L","Nidhi",5);
        voterIdInfoRepository.save("ABC515253","9454647484L","Rahul",5);
        voterIdInfoRepository.save("ABC616263","9565758596L","Rohan",5);
        voterIdInfoRepository.save("ABC717273","9616263646L","Raj",5);
        voterIdInfoRepository.save("ABC818283","9717273747L","Prem",5);
        voterIdInfoRepository.save("ABC919293","9818283848L","Shreya",5);
        voterIdInfoRepository.save("DEF123456","9919293949L","Sony",5);
        voterIdInfoRepository.save("DEF232425","9127847583L","Priya",5);
        voterIdInfoRepository.save("DEF121314","9984273739L","Neha",5);
        voterIdInfoRepository.save("DEF313233","9666777888L","Prakash",5);
        voterIdInfoRepository.save("DEF414243","9554748382L","Keerthi",5);
        
    }
}
