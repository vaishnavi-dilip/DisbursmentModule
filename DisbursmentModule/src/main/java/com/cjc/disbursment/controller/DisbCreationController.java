package com.cjc.disbursment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.disbursment.model.DisbursmentCreation;
import com.cjc.disbursment.service.ServiceI;

@RestController
public class DisbCreationController 
{
	@Autowired
	ServiceI sri;
	
	@PostMapping("/addDisbursment")
	public String addDisbcr(@RequestBody DisbursmentCreation dc)
	{
		System.out.println("inside disbusrment controller!");
		DisbursmentCreation d=sri.addDcr(dc);
		System.out.println(d);
		return "disbursment inserted";
	}

}
