package com.cjc.disbursment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.disbursment.model.EMIDetails;
import com.cjc.disbursment.service.ServiceI;

@RestController
public class EmiController 
{
	@Autowired
	ServiceI sri;
	
	@PostMapping("/addEmi")
	public String addEmi(@RequestBody EMIDetails e)
	{
		System.out.println("inside controller!");
		EMIDetails ed=sri.addEmi(e);
		System.out.println(ed);
		return "emi details added";
	}

}
