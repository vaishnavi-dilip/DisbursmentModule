package com.cjc.disbursment.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;

import net.bytebuddy.dynamic.loading.ClassReloadingStrategy.Strategy;

@Entity
@Table(name="disbursmentCr_DB")
public class DisbursmentCreation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int disbursmentid;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "bankid")
	private Bank bankid;
	@JoinColumn(name = "loandetailid")
	@OneToOne(cascade = CascadeType.ALL)
	private LoanDetails loandetailid;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "sanctionletterid")
	private SanctionLetter sanctionletterid;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "dealerid")
	
	private Dealer dealerid;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "subdealerid")
	private SubDealer subdealerid;
	@Column(name = "remarks")
	private String remarks;
	@Column(name = "disburstBy")
	private String disbusrtby;
	@Column(name = "amount_paid_date")
	private Date amount_pay_date;



public String getRemarks() {
	return remarks;
}


public void setRemarks(String remarks) {
	this.remarks = remarks;
}


public String getDisbusrtby() {
	return disbusrtby;
}


public void setDisbusrtby(String disbusrtby) {
	this.disbusrtby = disbusrtby;
}


public Date getAmount_pay_date() {
	return amount_pay_date;
}


public void setAmount_pay_date(Date amount_pay_date) {
	this.amount_pay_date = amount_pay_date;
}









public int getDisbursmentid() {
	return disbursmentid;
}


public void setDisbursmentid(int disbursmentid) {
	this.disbursmentid = disbursmentid;
}


public Bank getBaid() {
	return bankid;
}


public void setBaid(Bank bankid) {
	this.bankid = bankid;
}


public LoanDetails getLoandetailid() {
	return loandetailid;
}


public void setLoandetailid(LoanDetails loandetailid) {
	this.loandetailid = loandetailid;
}


public SanctionLetter getSanctionletterid() {
	return sanctionletterid;
}


public void setSanctionletterid(SanctionLetter sanctionletterid) {
	this.sanctionletterid = sanctionletterid;
}


public Dealer getDealerid() {
	return dealerid;
}


public void setDealerid(Dealer dealerid) {
	this.dealerid = dealerid;
}


public SubDealer getSubdealerid() {
	return subdealerid;
}


public void setSubdealerid(SubDealer subdealerid) {
	this.subdealerid = subdealerid;
}


@Override
public String toString() {
	return "DisbursmentCreation [disbursmentid=" + disbursmentid + ", bankid=" + bankid + ", loandetailid="
			+ loandetailid + ", sanctionletterid=" + sanctionletterid + ", dealerid=" + dealerid + ", subdealerid="
			+ subdealerid + ", remarks=" + remarks + ", disbusrtby=" + disbusrtby + ", amount_pay_date="
			+ amount_pay_date + "]";
}


public DisbursmentCreation(int disbursmentid, Bank bankid, LoanDetails loandetailid, SanctionLetter sanctionletterid,
		Dealer dealerid, SubDealer subdealerid, String remarks, String disbusrtby, Date amount_pay_date) {
	this.disbursmentid = disbursmentid;
	this.bankid = bankid;
	this.loandetailid = loandetailid;
	this.sanctionletterid = sanctionletterid;
	this.dealerid = dealerid;
	this.subdealerid = subdealerid;
	this.remarks = remarks;
	this.disbusrtby = disbusrtby;
	this.amount_pay_date = amount_pay_date;
}



	

}
