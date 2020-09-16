package com.cjc.disbursment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.disbursment.model.SubDealer;
import com.cjc.disbursment.service.ServiceI;

@RestController
public class SubDealerController 
{
	@Autowired
	ServiceI sri;
	
	@PostMapping("/addSub")
	public String addSub(@RequestBody SubDealer sb)
	{
		System.out.println("inside controller!");
		SubDealer s=sri.addsubd(sb);
		System.out.println(s);
		return "sub dealer added!";
	}

}
