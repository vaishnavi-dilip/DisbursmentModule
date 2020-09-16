package com.cjc.disbursment.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name="DisbursmentLedger_DB")
public class DisbursmentLeadger {
	@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int dibusrmentledgerid;

	@OneToOne(cascade = CascadeType.ALL)
	private LoanCase case1;
	
	@OneToOne(cascade = CascadeType.ALL)
	private  LoanDetails loandetail;
	
	public LoanCase getCase1() {
		return case1;
	}
	public void setCase1(LoanCase case1) {
		this.case1 = case1;
	}
	public LoanDetails getLoandetail() {
		return loandetail;
	}
	public void setLoandetail(LoanDetails loandetail) {
		this.loandetail = loandetail;
	}
	private int amount_pay_by_customer;
	
	private int emi_paid_date;
	private long emi_amount;
	private int defalulter_count;
	private long advance_emi_paid;
	private long amount_pay_to_dealer;
	
	
	public int getAmount_pay_by_customer() {
		return amount_pay_by_customer;
	}
	public int getDibusrmentledgerid() {
		return dibusrmentledgerid;
	}
	public void setDibusrmentledgerid(int dibusrmentledgerid) {
		this.dibusrmentledgerid = dibusrmentledgerid;
	}
	
	public void setAmount_pay_by_customer(int amount_pay_by_customer) {
		this.amount_pay_by_customer = amount_pay_by_customer;
	}
	
	public int getEmi_paid_date() {
		return emi_paid_date;
	}
	public void setEmi_paid_date(int emi_paid_date) {
		this.emi_paid_date = emi_paid_date;
	}
	public long getEmi_amount() {
		return emi_amount;
	}
	public void setEmi_amount(long emi_amount) {
		this.emi_amount = emi_amount;
	}
	public int getDefalulter_count() {
		return defalulter_count;
	}
	public void setDefalulter_count(int defalulter_count) {
		this.defalulter_count = defalulter_count;
	}
	public long getAdvance_emi_paid() {
		return advance_emi_paid;
	}
	public void setAdvance_emi_paid(long advance_emi_paid) {
		this.advance_emi_paid = advance_emi_paid;
	}
	public long getAmount_pay_to_dealer() {
		return amount_pay_to_dealer;
	}
	public void setAmount_pay_to_dealer(long amount_pay_to_dealer) {
		this.amount_pay_to_dealer = amount_pay_to_dealer;
	}
	@Override
	public String toString() {
		return "DisbursmentLeadgerDetailTable [dibusrmentledgerid=" + dibusrmentledgerid + ", amount_pay_by_customer="
				+ amount_pay_by_customer + ", emi_paid_date=" + emi_paid_date + ", emi_amount=" + emi_amount
				+ ", defalulter_count=" + defalulter_count + ", advance_emi_paid=" + advance_emi_paid
				+ ", amount_pay_to_dealer=" + amount_pay_to_dealer + "]";
	}
	
	
	

}
