package com.cjc.disbursment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.disbursment.model.DisbursmentLeadgerDetails;
import com.cjc.disbursment.service.ServiceI;

@RestController
public class DisbLeadgerController 
{
	@Autowired
	ServiceI sri;
	
	@PostMapping("/addDisbledger")
	public String addDl(@RequestBody DisbursmentLeadgerDetails dl)
	{
		System.out.println("inside controller!");
		DisbursmentLeadgerDetails d=sri.adddl(dl);
		System.out.println(d);
		return "disbursment leadger added";
	}

}
