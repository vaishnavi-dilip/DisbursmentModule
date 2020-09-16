package com.cjc.disbursment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cjc.disbursment.model.Customer;
@Repository
public interface CustomerRepo extends JpaRepository<Customer, Integer> 
{	
	

}
