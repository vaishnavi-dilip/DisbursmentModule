
  package com.cjc.disbursment.controller;
  
  import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import
  org.springframework.web.bind.annotation.RestController;

import com.cjc.disbursment.model.VehicleDetails;
import com.cjc.disbursment.service.ServiceI;
  
  @RestController public class VehicleController {
  
  @Autowired ServiceI sri;
  
  
  @PostMapping("/addVehicle")
  public String addVehicl(@RequestBody VehicleDetails vd)
  {
	  System.out.println("inside controller");
	  VehicleDetails v=sri.addvehicle(vd);
	  System.out.println(v);
	  return "vehicle added!";
  }
  
  }
 