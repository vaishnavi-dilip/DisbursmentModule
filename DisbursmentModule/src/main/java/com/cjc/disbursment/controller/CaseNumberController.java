package com.cjc.disbursment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.disbursment.model.Bank;
import com.cjc.disbursment.model.CaseNumber;
//import com.cjc.disbursment.model.Casenumber;
import com.cjc.disbursment.service.ServiceI;

@RestController
public class CaseNumberController 
{
	@Autowired
	ServiceI sri;
	
	
	
		@PostMapping("/addCaseno")
	  public String addcase(@RequestBody CaseNumber c) 
	  {
	  System.out.println("inside controller"); 
	  CaseNumber c1=sri.addCasen(c);
	  System.out.println(c1); 
	  return"case number added!"; 
	  }
	 
	 


}
