package com.eazybytes.service;

import java.util.List;
import java.util.Optional;

import com.eazybytes.entity.Customer;

public interface CustomerService {
	
	
	List<Customer> findByEmail(String email);
	
	public Customer saveCustomerDetails(Customer customer);

}
