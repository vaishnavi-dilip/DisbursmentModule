package com.cjc.disbursment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.disbursment.model.GurrenterDetails;
import com.cjc.disbursment.service.ServiceI;

@RestController
public class GuarrantorController 
{
	@Autowired
	ServiceI sri;
	@PostMapping("/addGua")
	public String addgua(@RequestBody GurrenterDetails gd)
	{
		System.out.println("inside controller");
		GurrenterDetails g=sri.addGui(gd);
		System.out.println(g);
		return"guarrantor added";
	}

}
