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
@Table(name="disbursment_DB")
public class Disbursment {
	
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int disbursmentid;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "loanid")
	private LoanDetails loanid;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "bankid")
	private Bank bankid;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "sanctionid")
	private SanctionLetter sanctionid;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "dealerid")
	private Dealer dealerid;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "Subdealer")
	private SubDealer subdealerid;
	
	private long amount_pay_to_dealer_date;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "casenumberid")
	private CaseNumber casenumber;
	
	private String remarks;
	
	private String disbursed_by;
	
	private long amount_pay_to_dealer;

	public int getDisbursmentid() {
		return disbursmentid;
	}

	public void setDisbursmentid(int disbursmentid) {
		this.disbursmentid = disbursmentid;
	}

	public LoanDetails getLoanid() {
		return loanid;
	}

	public void setLoanid(LoanDetails loanid) {
		this.loanid = loanid;
	}

	public Bank getBankid() {
		return bankid;
	}

	public void setBankid(Bank bankid) {
		this.bankid = bankid;
	}

	public SanctionLetter getSanctionid() {
		return sanctionid;
	}

	public void setSanctionid(SanctionLetter sanctionid) {
		this.sanctionid = sanctionid;
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

	public long getAmount_pay_to_dealer_date() {
		return amount_pay_to_dealer_date;
	}

	public void setAmount_pay_to_dealer_date(long amount_pay_to_dealer_date) {
		this.amount_pay_to_dealer_date = amount_pay_to_dealer_date;
	}

	public CaseNumber getCasenumber() {
		return casenumber;
	}

	public void setCasenumber(CaseNumber casenumber) {
		this.casenumber = casenumber;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getDisbursed_by() {
		return disbursed_by;
	}

	public void setDisbursed_by(String disbursed_by) {
		this.disbursed_by = disbursed_by;
	}

	public long getAmount_pay_to_dealer() {
		return amount_pay_to_dealer;
	}

	public void setAmount_pay_to_dealer(long amount_pay_to_dealer) {
		this.amount_pay_to_dealer = amount_pay_to_dealer;
	}
	
	
}
