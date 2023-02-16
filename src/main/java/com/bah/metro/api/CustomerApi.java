package com.bah.metro.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bah.metro.domain.Customer;
import com.bah.metro.domain.Event;

@RestController
@RequestMapping("/customers")
public class CustomerApi {
	
	ArrayList<Customer> customers = new ArrayList<Customer>() {
		{
			add(new Customer(1, "Tim", "Tim@bah.com", "password"));
			add(new Customer(2, "Haniah", "Haniah@bah.com", "password"));
			add(new Customer(3, "Mario", "Mario@bah.com", "password"));
			add(new Customer(4, "Luigi", "Luigi@bah.com", "password"));
			add(new Customer(5, "StarFox", "Starfox@bah.com", "password"));
		}
	};

	@GetMapping
	public List<Customer> getAllCustomers() {
		return customers;
	}
	
	@GetMapping("/{id}")
	public Customer getCustomerByID(@PathVariable("id") int id) {
		return customers.stream().filter(customer -> customer.getId()==id).findFirst().orElse(null);
	}
	
	
}
