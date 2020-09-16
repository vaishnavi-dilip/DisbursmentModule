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
@Table(name="DisbursmentLedger_DB")
public class DisbursmentLeadgerDetails {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int dibuledgerid;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="caseid")
	private LoanCase caseid;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="loanmasterid")
	private  LoanDetails loanmasterid;
	
	private int amount_bycustomer;
	
	private Date emi_paid_date;
	private long emi_amount;
	private int defalulter_count;
	private long advance_emi_paid;
	private long amount_todealer;
	public int getDibusrmentledgerid() {
		return dibuledgerid;
	}
	public void setDibusrmentledgerid(int dibusrmentledgerid) {
		this.dibuledgerid = dibusrmentledgerid;
	}
	public LoanCase getCaseid() {
		return caseid;
	}
	public void setCaseid(LoanCase caseid) {
		this.caseid = caseid;
	}
	public LoanDetails getLoanmasterid() {
		return loanmasterid;
	}
	public void setLoanmasterid(LoanDetails loanmasterid) {
		this.loanmasterid = loanmasterid;
	}
	public int getAmount_pay_by_customer() {
		return amount_bycustomer;
	}
	public void setAmount_pay_by_customer(int amount_pay_by_customer) {
		this.amount_bycustomer = amount_pay_by_customer;
	}
	public Date getEmi_paid_date() {
		return emi_paid_date;
	}
	public void setEmi_paid_date(Date emi_paid_date) {
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
		return amount_todealer;
	}
	public void setAmount_pay_to_dealer(long amount_pay_to_dealer) {
		this.amount_todealer = amount_pay_to_dealer;
	}
	@Override
	public String toString() {
		return "DisbursmentLeadgerDetailTable [dibusrmentledgerid=" + dibuledgerid + ", amount_bycustomer="
				+ amount_bycustomer + ", emi_paid_date=" + emi_paid_date + ", emi_amount=" + emi_amount
				+ ", defalulter_count=" + defalulter_count + ", advance_emi_paid=" + advance_emi_paid
				+ ", amount_pay_to_dealer=" + amount_todealer + "]";
	}
	
	
	public DisbursmentLeadgerDetails() {
		// TODO Auto-generated constructor stub
	}

}
