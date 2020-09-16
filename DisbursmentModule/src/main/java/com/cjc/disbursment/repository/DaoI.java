package com.cjc.disbursment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

//import com.example.demo.model.Customer;

public interface DaoI extends JpaRepository<com.cjc.disbursment.model.Customer,Integer> {

}
