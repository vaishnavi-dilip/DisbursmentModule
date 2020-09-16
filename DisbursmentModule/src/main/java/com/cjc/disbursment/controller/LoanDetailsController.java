package com.cjc.disbursment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.disbursment.model.LoanDetails;
import com.cjc.disbursment.service.ServiceI;

@RestController
public class LoanDetailsController 
{
	@Autowired
	ServiceI sri;
	
	@PostMapping("/addLoandetails")
	private String loand(@RequestBody LoanDetails l)
	{
		System.out.println("inside controller");
		LoanDetails ld=sri.addLoanDetail(l);
		System.out.println(ld);
		return "loan details added";
	}

}
