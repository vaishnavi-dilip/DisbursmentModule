package com.cjc.disbursment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.disbursment.model.Dealer;
import com.cjc.disbursment.service.ServiceI;

@RestController
public class DealerController 
{
	@Autowired
	ServiceI sri;
	@PostMapping("/addDealer")
	public String addDea(@RequestBody Dealer d)
	{
		System.out.println("inside Controller");
		Dealer d1=sri.addDeal(d);
		System.out.println(d1);
		return "dealer added!";
	}

}
