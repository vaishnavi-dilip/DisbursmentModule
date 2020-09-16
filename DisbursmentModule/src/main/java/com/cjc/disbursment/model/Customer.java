package com.cjc.disbursment.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.context.annotation.Configuration;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes;

@Entity
@Table(name="CustomerDetails_D")
public class Customer{
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int customerid;
	private String cust_name;
	private String cust_address;
	private String cust_gender;
	@Temporal(TemporalType.TIMESTAMP)
	@JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "yyyy-MM-dd HH:mm:s")
	private Date cust_dob;
	private double cust_salalry;
	private double cust_annual_income;
	private String emailid;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="cibils_Score")
	private Cibil score;
	
	
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="gurrenterid")
	private GurrenterDetails gurrenterid;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="vehicleid")
	private VehicleDetails vehicleid;
	
	
	
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	public GurrenterDetails getGurrenterid() {
		return gurrenterid;
	}
	public void setGurrenterid(GurrenterDetails gurrenterid) {
		this.gurrenterid = gurrenterid;
	}
	public int getCustid() {
		return customerid;
	}
	public void setCustid(int custid) {
		this.customerid = custid;
	}
	
	
	public VehicleDetails getVehicleid() {
		return vehicleid;
	}
	public void setVehicleid(VehicleDetails vehicleid) {
		this.vehicleid = vehicleid;
	}
	public String getCust_name() {
		return cust_name;
	}
	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}
	public String getCust_address() {
		return cust_address;
	}
	public void setCust_address(String cust_address) {
		this.cust_address = cust_address;
	}
	public String getCust_gender() {
		return cust_gender;
	}
	public void setCust_gender(String cust_gender) {
		this.cust_gender = cust_gender;
	}
	public Date getCust_dob() {
		return cust_dob;
	}
	public void setCust_dob(Date cust_dob) {
		this.cust_dob = cust_dob;
	}
	public double getCust_salalry() {
		return cust_salalry;
	}
	public void setCust_salalry(double cust_salalry) {
		this.cust_salalry = cust_salalry;
	}
	public double getCust_annual_income() {
		return cust_annual_income;
	}
	public void setCust_annual_income(double cust_annual_income) {
		this.cust_annual_income = cust_annual_income;
	}
	
	
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	public Cibil getScore() {
		return score;
	}
	public void setScore(Cibil score) {
		this.score = score;
	}
	public Customer(int customerid, String cust_name, String cust_address, String cust_gender, Date cust_dob,
			double cust_salalry, double cust_annual_income, String emailid, Cibil score, GurrenterDetails gurrenterid,
			VehicleDetails vehicleid) {
		this.customerid = customerid;
		this.cust_name = cust_name;
		this.cust_address = cust_address;
		this.cust_gender = cust_gender;
		this.cust_dob = cust_dob;
		this.cust_salalry = cust_salalry;
		this.cust_annual_income = cust_annual_income;
		this.emailid = emailid;
		this.score = score;
		this.gurrenterid = gurrenterid;
		this.vehicleid = vehicleid;
	}
	@Override
	public String toString() {
		return "Customer [customerid=" + customerid + ", cust_name=" + cust_name + ", cust_address=" + cust_address
				+ ", cust_gender=" + cust_gender + ", cust_dob=" + cust_dob + ", cust_salalry=" + cust_salalry
				+ ", cust_annual_income=" + cust_annual_income + ", emailid=" + emailid + ", score=" + score
				+ ", gurrenterid=" + gurrenterid + ", vehicleid=" + vehicleid + "]";
	}
	
	
	
	
	
}