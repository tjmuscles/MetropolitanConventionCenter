package com.bah.metro.api;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bah.metro.domain.Registration;
import com.bah.metro.repository.RegistrationRepository;

@RestController
@RequestMapping("/registrations")
public class RegistrationApi {

	@Autowired
	RegistrationRepository repo;
	
	//PROJECT DAY 1
//	ArrayList<Registration> registrations = new ArrayList<Registration>() {
//		{
//			add(new Registration(1, 1, 5, new Date(), "The date isn't set yet"));
//			add(new Registration(2, 2, 4, new Date(), "The date isn't set yet"));
//			add(new Registration(3, 3, 3, new Date(), "The date isn't set yet"));
//			add(new Registration(4, 4, 2, new Date(), "The date isn't set yet"));
//			add(new Registration(5, 5, 1, new Date(), "The date isn't set yet"));
//			
//		}
//	};
//
//	@GetMapping
//	public List<Registration> getAllRegistrations() {
//		return registrations;
//	}
//	
//	@GetMapping("/{id}")
//	public Registration getCustomerByID(@PathVariable("id") int id) {
//		return registrations.stream().filter(registration -> registration.getId()==id).findFirst().orElse(null);
//	}
	
}
