package com.cjc.disbursment.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Subdealer_D")
public class SubDealer 
{
	@Id
	@Column(name = "subdealerid")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int subdealerid;
	@Column(name = "firstname")
	private String firstname;
	@Column(name = "lastname")
	private String lastname;
	@Column(name = "email_id")
	private String emailid;
	@Column(name = "contact_no")
	private Long contactno;
	
	public SubDealer() {
		// TODO Auto-generated constructor stub
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public Long getContactno() {
		return contactno;
	}

	public void setContactno(Long contactno) {
		this.contactno = contactno;
	}

	public SubDealer(int subdealerid, String firstname, String lastname, String emailid, Long contactno) {
		this.subdealerid = subdealerid;
		this.firstname = firstname;
		this.lastname = lastname;
		this.emailid = emailid;
		this.contactno = contactno;
	}

	@Override
	public String toString() {
		return "SubDealer [subdealerid=" + subdealerid + ", firstname=" + firstname + ", lastname=" + lastname
				+ ", emailid=" + emailid + ", contactno=" + contactno + "]";
	}
	
	
	
	

}
