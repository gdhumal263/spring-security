package com.eazybytes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eazybytes.entity.Customer;
import com.eazybytes.service.CustomerService;

@RestController
@RequestMapping()
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	
	@PostMapping("/register")
	public ResponseEntity<Customer>  registerUser(@RequestBody Customer customer){
		
		Customer saveCustomerDetails = customerService.saveCustomerDetails(customer);
		
		return new ResponseEntity<>(saveCustomerDetails,HttpStatus.CREATED);
	}
	
	

}
