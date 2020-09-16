package com.cjc.disbursment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.disbursment.model.LoanCase;
import com.cjc.disbursment.service.ServiceI;

@RestController
public class LoanCaseController 
{
	@Autowired
	ServiceI sri;
	
	@PostMapping("/addLoan")
	public String addLoancase(@RequestBody LoanCase lc)
	{
		System.out.println("inside controller");
		LoanCase l=sri.adaLoan(lc);
		System.out.println(l);
		return "loan case added!";
	}

}
