package com.github.Radu_A.shipping_20.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.Radu_A.shipping_20.entity.Customer;
import com.github.Radu_A.shipping_20.repository.CustomerRepository;

import jakarta.transaction.Transactional;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@Transactional
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}
	
	@Transactional
	public Customer save(Customer customer) {
		Customer savedCustomer = customerRepository.save(customer);
		return savedCustomer;
	}
}
