package com.example.restservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.restservice.entities.BookSlot;
import com.example.restservice.entities.VoterIdInfo;
import com.example.restservice.models.Phone;
import com.example.restservice.services.BookingService;
import com.example.restservice.services.GenerateOtpService;
import com.example.restservice.services.SigninService;
import com.example.restservice.services.VoterIdInfoService;

@Controller
public class WebController {

	@Autowired
	private GenerateOtpService generateOtpService;
    
    @Autowired
	private SigninService signinService;

	@Autowired
	private BookingService bookingService;

	@Autowired
	private VoterIdInfoService voterIdInfoService;

	@GetMapping("/greeting")
	public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		model.addAttribute("name", name);
		return "greeting";
	}

	@GetMapping("/signup")
	public String login(Model model) {
        model.addAttribute("phone", new Phone());
		return "signup";
	}
	
	@PostMapping(path = "/generateotp")
	public String generateotp(@ModelAttribute Phone phone, Model model) {
        boolean generated = generateOtpService.generateOtp(phone.getPhoneNumber());
        if (generated) {
            return "login";
        }
        return "signup";
	}
	
	@PostMapping(path = "/signin")
	public String login(@ModelAttribute Phone phone, Model model) {
        boolean signinSuccess = signinService.logIn(phone.getPhoneNumber(),phone.getOtp());
        if (signinSuccess) {
            VoterIdInfo voterIdInfo = voterIdInfoService.getInfo(phone.getPhoneNumber());
			model.addAttribute("voteridinfo", voterIdInfo);
			System.out.println(voterIdInfo.getName());
        	return "displayInfo";
        }
        return "login";
	}

	// @PostMapping(path = "/booking")
	// public String booking(@ModelAttribute BookSlot bookSlot, Model model) {
	// 	 bookingService.slotBooking(bookSlot);
	// 	 return "index"; 
	// }

	
    

}


