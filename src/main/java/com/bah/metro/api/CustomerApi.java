package com.bah.metro.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bah.metro.domain.Customer;

@RestController
@RequestMapping("/customers")
public class CustomerApi {

	@GetMapping
	public List<Customer> getAllCustomers() {
		List<Customer> customers = new ArrayList<>();
		customers.add(new Customer(1, "Tim", "Tim@bah.com", "password"));
		customers.add(new Customer(2, "Haniah", "Haniah@bah.com", "password"));
		customers.add(new Customer(3, "Mario", "Mario@bah.com", "password"));
		customers.add(new Customer(4, "Luigi", "Luigi@bah.com", "password"));
		customers.add(new Customer(5, "StarFox", "Starfox@bah.com", "password"));

		return customers;
	}
	
	@GetMapping("/{id}")
	public Customer getCustomerByID(@PathVariable("id") int id) {
		return this.getAllCustomers().stream().filter(customer -> customer.getId()==id).findFirst().orElse(null);
	}
	
	
}
