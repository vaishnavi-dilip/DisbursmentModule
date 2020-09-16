package com.cjc.disbursment.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Bank_D")
public class Bank 
{
	@Id
	@Column(name = "bankid")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int baid;
	@Column(name = "Bank_name")
	private String bankName;
	@Column(name = "Branch_name")
	private String branchName;
	@Column(name="branch_area")
	private String area;
	@Column(name="Building_name")
	private String buildingname;
	@Column(name="landmark")
	private String landmark;
	@Column(name="pincode")
	private int pincode;
	@Column(name="city")
	private String city;
	@Column(name="taluka")
	private String taluka;
	@Column(name="state")
	private String state;
	@Column(name="county")
	private String country;
	
	
	 public Bank() {
		// TODO Auto-generated constructor stub
	} 
	@Override
	public String toString() {
		return "Bank [baid=" + baid + ", bankName=" + bankName + ", branchName=" + branchName + ", area=" + area
				+ ", buildingname=" + buildingname + ", landmark=" + landmark + ", pincode=" + pincode + ", city="
				+ city + ", taluka=" + taluka + ", state=" + state + ", country=" + country + "]";
	}
	public Bank(String area, String buildingname, String landmark, int pincode, String city, String taluka,
			String state, String country) {
		this.area = area;
		this.buildingname = buildingname;
		this.landmark = landmark;
		this.pincode = pincode;
		this.city = city;
		this.taluka = taluka;
		this.state = state;
		this.country = country;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getBuildingname() {
		return buildingname;
	}
	public void setBuildingname(String buildingname) {
		this.buildingname = buildingname;
	}
	public String getLandmark() {
		return landmark;
	}
	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getTaluka() {
		return taluka;
	}
	public Bank(int baid, String bankName, String branchName, String area, String buildingname, String landmark,
			int pincode, String city, String taluka, String state, String country) {
		this.baid = baid;
		this.bankName = bankName;
		this.branchName = branchName;
		this.area = area;
		this.buildingname = buildingname;
		this.landmark = landmark;
		this.pincode = pincode;
		this.city = city;
		this.taluka = taluka;
		this.state = state;
		this.country = country;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public void setTaluka(String taluka) {
		this.taluka = taluka;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	

}
