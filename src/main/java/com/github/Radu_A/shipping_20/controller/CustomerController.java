package com.github.Radu_A.shipping_20.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.Radu_A.shipping_20.entity.Customer;
import com.github.Radu_A.shipping_20.service.CustomerService;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@GetMapping("")
	public List<Customer> findAll() {
		return customerService.findAll();
	}
	
	@PostMapping("")
	public Customer save(@RequestBody Customer customer) {
		return customerService.save(customer);
	}
} 
