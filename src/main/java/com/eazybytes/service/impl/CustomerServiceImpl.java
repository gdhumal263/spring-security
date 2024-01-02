package com.eazybytes.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.eazybytes.entity.Customer;
import com.eazybytes.repository.CustomerRepository;
import com.eazybytes.service.CustomerService;
@Service
public class CustomerServiceImpl implements CustomerService {
	
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private PasswordEncoder passwordEncoder;

	@Override
	public List<Customer> findByEmail(String email) {
		
		List<Customer> findByEmail = customerRepository.findByEmail(email);
		 
		return findByEmail;
	}

	@Override
	public Customer saveCustomerDetails(Customer customer) {
		
		customer.setPassword(passwordEncoder.encode(customer.getPassword()));
		return customerRepository.save(customer);
	}

}
