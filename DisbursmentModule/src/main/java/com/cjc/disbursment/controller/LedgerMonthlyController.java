package com.cjc.disbursment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.disbursment.model.LedgerMonthlydetails;
import com.cjc.disbursment.service.ServiceI;

@RestController
public class LedgerMonthlyController 
{
	@Autowired
	ServiceI sri;
	@PostMapping("/addMonth")
	public String addLedmonth(@RequestBody LedgerMonthlydetails lm)
	{
		System.out.println("inside controller");
		LedgerMonthlydetails l=sri.addLedMonthly(lm);
		System.out.println(l);
		return "monthly details added!";
	}
	
	

}
