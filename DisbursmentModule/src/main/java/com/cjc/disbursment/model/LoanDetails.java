package com.cjc.disbursment.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="loandetails_DB")
public class LoanDetails{
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int loandetailid;
	private double total_amt_bank;
	private double total_paid_amount;
	private Date paid_Date;
	private int Bucket;

	public double getTotal_amount_paid_to_bank() {
		return total_amt_bank;
	}

	public void setTotal_amount_paid_to_bank(double total_amt_bank) {
		this.total_amt_bank = total_amt_bank;
	}

	public Date getPaid_Date() {
		return paid_Date;
	}

	public void setPaid_Date(Date paid_Date) {
		this.paid_Date = paid_Date;
	}

	public int getBucket() {
		return Bucket;
	}

	public void setBucket(int bucket) {
		Bucket = bucket;
	}

	public int getLoandetailid() {
		return loandetailid;
	}

	public void setLoandetailid(int loandetailid) {
		this.loandetailid = loandetailid;
	}

	public double getTotal_paid_amount() {
		return total_paid_amount;
	}

	public void setTotal_paid_amount(double total_paid_amount) {
		this.total_paid_amount = total_paid_amount;
	}
	public LoanDetails() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "LoanDetails [loandetailid=" + loandetailid + ", total_amount_paid_to_bank=" + total_amt_bank
				+ ", total_paid_amount=" + total_paid_amount + ", paid_Date=" + paid_Date + ", Bucket=" + Bucket + "]";
	}
	
	
}