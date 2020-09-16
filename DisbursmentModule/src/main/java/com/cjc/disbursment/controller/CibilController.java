package com.cjc.disbursment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.disbursment.model.Cibil;

import com.cjc.disbursment.service.ServiceI;

@RestController
public class CibilController 
{
	@Autowired
	ServiceI sri;
	
	@PostMapping("/addCibil")
	public String addCib(@RequestBody Cibil cs)
	{
		System.out.println("inside controller");
		Cibil c=sri.addcbil(cs);
		System.out.println(c);
		return "cibil added!";
	}

}
