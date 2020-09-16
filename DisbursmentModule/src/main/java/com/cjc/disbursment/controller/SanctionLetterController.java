package com.cjc.disbursment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.disbursment.model.SanctionLetter;
import com.cjc.disbursment.service.ServiceI;

@RestController
public class SanctionLetterController 
{
	@Autowired
	ServiceI sri;

	@PostMapping("/addSanction")
	public String addSanction(@RequestBody SanctionLetter sl)
	{
		System.out.println("inside controller!");
		SanctionLetter s=sri.addSanction(sl);
		System.out.println(s);
		return "sanction details added!";
	}
}
