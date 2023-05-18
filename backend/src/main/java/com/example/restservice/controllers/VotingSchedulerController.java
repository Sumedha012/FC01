package com.example.restservice.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.ui.Model;
// import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
// import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.restservice.entities.BookSlot;
import com.example.restservice.entities.SlotAvail;
import com.example.restservice.services.AvailabilityService;
import com.example.restservice.services.BookingService;
import com.example.restservice.services.GenerateOtpService;
// import com.example.restservice.services.SigninService;
import com.example.restservice.services.VoterIdInfoService;

@RestController
public class VotingSchedulerController {


   
	
	
	@Autowired
	private AvailabilityService availabilityService;

	// @Autowired
	// private SigninService signinService;

	@Autowired
	private GenerateOtpService generateOtpService;

	@Autowired
	private BookingService bookingService;

	@Autowired
	private VoterIdInfoService voterIdInfoService;



@RequestMapping(method=RequestMethod.GET, value= "/slotavailability")
	public List<SlotAvail> availability(){
		return availabilityService.getSlots();
	}

		@RequestMapping(method=RequestMethod.POST, value = "/initializevoterinfo")
		public void VoterIdInfo() {
			voterIdInfoService.initialize();
	}

	@RequestMapping(method=RequestMethod.PUT, value = "/booking")
	public boolean booking(@RequestBody BookSlot bookSlot) {
		return bookingService.slotBooking(bookSlot);
	}

	@RequestMapping(method=RequestMethod.POST, value = "/generateotp/{phonenumber}")
	public boolean Login(@PathVariable  Long phonenumber) {
		return generateOtpService.generateOtp(phonenumber);
	}
	
}