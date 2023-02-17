package com.bah.metro.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bah.metro.domain.Event;
import com.bah.metro.repository.CustomersRepository;
import com.bah.metro.repository.EventRepository;

@RestController
@RequestMapping("/events")
public class EventApi {
	
	
	@Autowired
	EventRepository repo;
	
	
	
	
	
	
	
	
	//PROJECT DAY 1
//	ArrayList<Event> events = new ArrayList<Event>() {
//		{
//		add(new Event(1, "CNF001", "All-Java Conference", "Lectures and exhibits covering all Java topics"));
//		add(new Event(2, "WKS002", "Spring Boot Workshop", "Hands-on Spring Boot Workshop"));
//		add(new Event(3, "TRN001", "Angular Training Course", "Five day introductory training in Angular"));
//		add(new Event(4, "RNR004", "Rock n Roll Concert", "BAH Employees RocknRoll Concert"));
//		}
//	};
//
//	
//	@GetMapping
//	public List<Event> getAllEvents() {
//		return events;
//	}
//	
//
//	public List<Event> getAll() {
//		return this.events;
//	}
//	
//	@GetMapping("/{eventId}")
//	public Event getCustomerById(@PathVariable("eventId") long id) {
//		return this.getAllEvents().stream().filter(event-> event.getId()==id).findFirst().orElse(null);
//	}
	

}
