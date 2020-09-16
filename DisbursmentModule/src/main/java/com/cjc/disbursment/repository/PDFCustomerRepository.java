package com.cjc.disbursment.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cjc.disbursment.model.Customer;

//import com.example.demo.model.Customer;
 @Repository
public interface PDFCustomerRepository extends CrudRepository<Customer, Integer>{

	}