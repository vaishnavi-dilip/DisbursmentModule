package com.cjc.disbursment.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="dealer_DB")
public class Dealer{
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "dealerid")
	private int dealerid;
	private String dealer_name;
	private String dealer_account_name;
	private int dealer_account_number;
	private int dealer_IFSC_code;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="customerid")
	private Customer customerid;
	
	
	public Customer getCustomerid() {
		return customerid;
	}
	public void setCustomerid(Customer customerid) {
		this.customerid = customerid;
	}
	public int getDealerid() {
		return dealerid;
	}
	public void setDealerid(int dealerid) {
		this.dealerid = dealerid;
	}
	public String getDealer_name() {
		return dealer_name;
	}
	public void setDealer_name(String dealer_name) {
		this.dealer_name = dealer_name;
	}
	public String getDealer_account_name() {
		return dealer_account_name;
	}
	public void setDealer_account_name(String dealer_account_name) {
		this.dealer_account_name = dealer_account_name;
	}
	public int getDealer_account_number() {
		return dealer_account_number;
	}
	public void setDealer_account_number(int dealer_account_number) {
		this.dealer_account_number = dealer_account_number;
	}
	public int getDealer_IFSC_code() {
		return dealer_IFSC_code;
	}
	public void setDealer_IFSC_code(int dealer_IFSC_code) {
		this.dealer_IFSC_code = dealer_IFSC_code;
	}
	
	public Dealer(int dealerid, String dealer_name, String dealer_account_name, int dealer_account_number,
			int dealer_IFSC_code, Customer customerid) {
		this.dealerid = dealerid;
		this.dealer_name = dealer_name;
		this.dealer_account_name = dealer_account_name;
		this.dealer_account_number = dealer_account_number;
		this.dealer_IFSC_code = dealer_IFSC_code;
		this.customerid = customerid;
	}
	public Dealer() {
		// TODO Auto-generated constructor stub
	}
	
	
}