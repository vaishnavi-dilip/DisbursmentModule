package com.cjc.disbursment.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="vehicle_DB")
public class VehicleDetails{
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int vehicleid;
	private String vehicle_name;
	private double vehicle_amount;
	private int vehicle_chassis_number;
	
	public int getVehicleid() {
		return vehicleid;
	}
	public void setVehicleid(int vehicleid) {
		this.vehicleid = vehicleid;
	}
	public String getVehicle_name() {
		return vehicle_name;
	}
	public void setVehicle_name(String vehicle_name) {
		this.vehicle_name = vehicle_name;
	}
	public double getVehicle_amount() {
		return vehicle_amount;
	}
	public void setVehicle_amount(double vehicle_amount) {
		this.vehicle_amount = vehicle_amount;
	}
	public int getVehicle_chassis_number() {
		return vehicle_chassis_number;
	}
	public void setVehicle_chassis_number(int vehicle_chassis_number) {
		this.vehicle_chassis_number = vehicle_chassis_number;
	}
	public VehicleDetails() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "VehicleDetails [vehicleid=" + vehicleid + ", vehicle_name=" + vehicle_name + ", vehicle_amount="
				+ vehicle_amount + ", vehicle_chassis_number=" + vehicle_chassis_number + "]";
	}
	
}