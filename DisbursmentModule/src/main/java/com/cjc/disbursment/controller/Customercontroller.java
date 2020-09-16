package com.cjc.disbursment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.disbursment.model.Customer;
import com.cjc.disbursment.service.ServiceI;

@RestController
public class Customercontroller 
{
	@Autowired
	ServiceI sri;
	
	@PostMapping("/addCustomer")
	public String addCust(@RequestBody Customer c)
	{
		System.out.println("inside controller!");
		Customer c1=sri.addCust(c);
		System.out.println(c1);
		return "customer added!";
	}

}
