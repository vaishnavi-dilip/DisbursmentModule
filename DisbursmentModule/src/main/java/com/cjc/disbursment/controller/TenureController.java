package com.cjc.disbursment.controller;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.disbursment.model.Tenure;
import com.cjc.disbursment.service.ServiceI;

@RestController
public class TenureController 
{
	@Autowired
	ServiceI sri;
	
	@PostMapping("/addTenure")
	public String addTen(@RequestBody Tenure t)
	{
		System.out.println("inside controller");
		Tenure tn=sri.addTenu(t);
		System.out.println(tn);
		return "tenure added!";
	}

}
