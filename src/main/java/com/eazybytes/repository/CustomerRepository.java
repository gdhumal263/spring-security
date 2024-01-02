package com.eazybytes.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.eazybytes.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>{
	

	List<Customer> findByEmail(String email);

}
