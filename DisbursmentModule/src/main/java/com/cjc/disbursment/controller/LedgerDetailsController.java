package com.cjc.disbursment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.disbursment.model.LedgerDetail;
import com.cjc.disbursment.service.ServiceI;

@RestController
public class LedgerDetailsController 
{
	@Autowired
	ServiceI sri;
	
	@PostMapping("/addLed")
	public String addLed(@RequestBody LedgerDetail l)
	{
		System.out.println("inside controller!");
		LedgerDetail ld=sri.addLed(l);
		System.out.println(ld);
		return "ledger details added!";
		
	}

}
