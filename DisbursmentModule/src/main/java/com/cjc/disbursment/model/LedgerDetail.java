package com.cjc.disbursment.model;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Ledger_DB")
public class LedgerDetail {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int ledgerid;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="caseid")
	private  LoanCase caseid;
	
	private long total_paid_amount;
	
	private long amount_pay_by_customer;
	
	private Date emi_paid_date;
	
	private double emi_amount;
	
	private  int defaulter_count;
	
	private double advance_emi_paid;
	
	private double reamining_pay_by_customer;

	public int getLedgerid() {
		return ledgerid;
	}

	public void setLedgerid(int ledgerid) {
		this.ledgerid = ledgerid;
	}

	public LoanCase getCaseid() {
		return caseid;
	}

	public void setCaseid(LoanCase caseid) {
		this.caseid = caseid;
	}

	public long getTotal_paid_amount() {
		return total_paid_amount;
	}

	public void setTotal_paid_amount(long total_paid_amount) {
		this.total_paid_amount = total_paid_amount;
	}

	public long getAmount_pay_by_customer() {
		return amount_pay_by_customer;
	}

	public void setAmount_pay_by_customer(long amount_pay_by_customer) {
		this.amount_pay_by_customer = amount_pay_by_customer;
	}

	public Date getEmi_paid_date() {
		return emi_paid_date;
	}

	public void setEmi_paid_date(Date emi_paid_date) {
		this.emi_paid_date = emi_paid_date;
	}

	public double getEmi_amount() {
		return emi_amount;
	}

	public void setEmi_amount(double emi_amount) {
		this.emi_amount = emi_amount;
	}

	public int getDefaulter_count() {
		return defaulter_count;
	}

	public void setDefaulter_count(int defaulter_count) {
		this.defaulter_count = defaulter_count;
	}

	public double getAdvance_emi_paid() {
		return advance_emi_paid;
	}

	public void setAdvance_emi_paid(double advance_emi_paid) {
		this.advance_emi_paid = advance_emi_paid;
	}

	public double getReamining_pay_by_customer() {
		return reamining_pay_by_customer;
	}

	public void setReamining_pay_by_customer(double reamining_pay_by_customer) {
		this.reamining_pay_by_customer = reamining_pay_by_customer;
	}

	@Override
	public String toString() {
		return "LedgerDetail [ledgerid=" + ledgerid + ", total_paid_amount=" + total_paid_amount
				+ ", amount_pay_by_customer=" + amount_pay_by_customer + ", emi_paid_date=" + emi_paid_date
				+ ", emi_amount=" + emi_amount + ", defaulter_count=" + defaulter_count + ", advance_emi_paid="
				+ advance_emi_paid + ", reamining_pay_by_customer=" + reamining_pay_by_customer + "]";
	}
	
	
	public LedgerDetail() {
		// TODO Auto-generated constructor stub
	}
	
	

}
