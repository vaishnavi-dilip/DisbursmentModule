package com.cjc.disbursment.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonIgnoreType;

@Entity
@Table(name="Emi_DB")
@JsonIgnoreType
@JsonIgnoreProperties(value = {"emi_last_date", "emi_paid_date"}, 
                      allowGetters = true)
public class EMIDetails{
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int emipaymentid;
	private int loan_no;
	private double emi_amount;
	private Date emi_last_date;
	private double emi_paid_amount;
	private Date emi_paid_date;
	public int getEmipaymentid() {
		return emipaymentid;
	}
	public void setEmipaymentid(int emipaymentid) {
		this.emipaymentid = emipaymentid;
	}
	public int getLoan_no() {
		return loan_no;
	}
	public void setLoan_no(int loan_no) {
		this.loan_no = loan_no;
	}
	
	public double getEmi_amount() {
		return emi_amount;
	}
	public void setEmi_amount(double emi_amount) {
		this.emi_amount = emi_amount;
	}
	public double getEmi_paid_amount() {
		return emi_paid_amount;
	}
	public void setEmi_paid_amount(double emi_paid_amount) {
		this.emi_paid_amount = emi_paid_amount;
	}
	public void setEmi_amount(int emi_amount) {
		this.emi_amount = emi_amount;
	}
	public Date getEmi_last_date() {
		return emi_last_date;
	}
	public void setEmi_last_date(Date emi_last_date) {
		this.emi_last_date = emi_last_date;
	}
	
	public Date getEmi_paid_date() {
		return emi_paid_date;
	}
	public void setEmi_paid_date(Date emi_paid_date) {
		this.emi_paid_date = emi_paid_date;
	}
	
	public EMIDetails() {
		// TODO Auto-generated constructor stub
	}
	public EMIDetails(int emipaymentid, int loan_no, double emi_amount, Date emi_last_date, double emi_paid_amount,
			Date emi_paid_date) {
		this.emipaymentid = emipaymentid;
		this.loan_no = loan_no;
		this.emi_amount = emi_amount;
		this.emi_last_date = emi_last_date;
		this.emi_paid_amount = emi_paid_amount;
		this.emi_paid_date = emi_paid_date;
	}
	@Override
	public String toString() {
		return "EMIDetails [emipaymentid=" + emipaymentid + ", loan_no=" + loan_no + ", emi_amount=" + emi_amount
				+ ", emi_last_date=" + emi_last_date + ", emi_paid_amount=" + emi_paid_amount + ", emi_paid_date="
				+ emi_paid_date + "]";
	}
	
		
}