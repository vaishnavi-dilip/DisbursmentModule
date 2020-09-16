package com.cjc.disbursment.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Guarantor_DB")
public class GurrenterDetails{
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int gurrenter_id;
	private String gurrenter_name;
	private String gurrenter_pancard_no;
	private double gurrenter_salary;
	public int getGurrenter_id() {
		return gurrenter_id;
	}
	public void setGurrenter_id(int gurrenter_id) {
		this.gurrenter_id = gurrenter_id;
	}
	public String getGurrenter_name() {
		return gurrenter_name;
	}
	public void setGurrenter_name(String gurrenter_name) {
		this.gurrenter_name = gurrenter_name;
	}
	public String getGurrenter_pancard_no() {
		return gurrenter_pancard_no;
	}
	public void setGurrenter_pancard_no(String gurrenter_pancard_no) {
		this.gurrenter_pancard_no = gurrenter_pancard_no;
	}
	public double getGurrenter_salary() {
		return gurrenter_salary;
	}
	public void setGurrenter_salary(double gurrenter_salary) {
		this.gurrenter_salary = gurrenter_salary;
	}
	
	public GurrenterDetails() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "GurrenterDetails [gurrenter_id=" + gurrenter_id + ", gurrenter_name=" + gurrenter_name
				+ ", gurrenter_pancard_no=" + gurrenter_pancard_no + ", gurrenter_salary=" + gurrenter_salary + "]";
	}
	public GurrenterDetails(int gurrenter_id, String gurrenter_name, String gurrenter_pancard_no,
			double gurrenter_salary) {
		this.gurrenter_id = gurrenter_id;
		this.gurrenter_name = gurrenter_name;
		this.gurrenter_pancard_no = gurrenter_pancard_no;
		this.gurrenter_salary = gurrenter_salary;
	}
	
	
}