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

@Entity
@Table(name="LedgerMonthly_DB")
public class LedgerMonthlydetails {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)	
	private int ledgerid;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "caseid")
	private LoanCase caseid;
	private double Total_paid_amount;
	private double amount_pay_by_customer;
	private Date EMI_paid_date;
	private int EMI_account;
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
	public double getTotal_paid_amount() {
		return Total_paid_amount;
	}
	public void setTotal_paid_amount(double total_paid_amount) {
		Total_paid_amount = total_paid_amount;
	}
	public double getAmount_pay_by_customer() {
		return amount_pay_by_customer;
	}
	public void setAmount_pay_by_customer(double amount_pay_by_customer) {
		this.amount_pay_by_customer = amount_pay_by_customer;
	}
	public Date getEMI_paid_date() {
		return EMI_paid_date;
	}
	public void setEMI_paid_date(Date eMI_paid_date) {
		EMI_paid_date = eMI_paid_date;
	}
	public int getEMI_account() {
		return EMI_account;
	}
	public void setEMI_account(int eMI_account) {
		EMI_account = eMI_account;
	}
	@Override
	public String toString() {
		return "LedgerMonthlydetails [ledgerid=" + ledgerid + ", caseid="
				+ caseid + ", Total_paid_amount=" + Total_paid_amount
				+ ", amount_pay_by_customer=" + amount_pay_by_customer
				+ ", EMI_paid_date=" + EMI_paid_date + ", EMI_account="
				+ EMI_account + "]";
	}
	public LedgerMonthlydetails() {
		// TODO Auto-generated constructor stub
	}
	
}
