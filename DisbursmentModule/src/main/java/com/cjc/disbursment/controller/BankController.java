package com.cjc.disbursment.controller;

import java.util.Optional;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.disbursment.model.Bank;
import com.cjc.disbursment.service.ServiceI;

@RestController
public class BankController 
{
	@Autowired
	ServiceI sri;
	public static final Logger logger=Logger.getLogger(BankController.class);
	
	@PostMapping("addBank")
	public String addBan(@RequestBody Bank b)
	{
		System.out.println("inside controller");
		Bank b1=sri.addBank(b);
		System.out.println(b1);
		return"bank added!";
	}
	
	@GetMapping("/getBank/{bid}")
	public String getBank(@PathVariable ("bid") int bid)
	{
		System.out.println("inside bank");
		Optional<Bank> b=sri.getBankById(bid);
		logger.info(b);
		return "Bank retrived successfully!";
		
	}
}
