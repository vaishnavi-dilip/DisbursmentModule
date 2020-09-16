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
@Table(name="Sanctionletter_DB")
public class SanctionLetter{
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int sanctionletterid;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="loandetailid")
	private LoanDetails loandetailid;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="emipaymentid")
	private EMIDetails emipaymentid;

	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="tenureid")
	private Tenure tenureid;

	/*
	 * public int getSanction_letter_id() { return sanction_letter_id; }
	 * 
	 * public void setSanction_letter_id(int sanction_letter_id) {
	 * this.sanction_letter_id = sanction_letter_id; }
	 */

	public LoanDetails getLoandetailid() {
		return loandetailid;
	}

	public void setLoandetailid(LoanDetails loandetailid) {
		this.loandetailid = loandetailid;
	}

	public EMIDetails getEmipaymentid() {
		return emipaymentid;
	}

	public void setEmipaymentid(EMIDetails emipaymentid) {
		this.emipaymentid = emipaymentid;
	}

	public Tenure getTenureid() {
		return tenureid;
	}

	public void setTenureid(Tenure tenureid) {
		this.tenureid = tenureid;
	}
	public SanctionLetter() {
		// TODO Auto-generated constructor stub
	}

}
	