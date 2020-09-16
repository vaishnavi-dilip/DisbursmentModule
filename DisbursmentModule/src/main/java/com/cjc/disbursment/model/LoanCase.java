package com.cjc.disbursment.model;

import java.util.Scanner;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.context.annotation.ScannedGenericBeanDefinition;

@Entity
@Table(name = "LoanCase_D")
public class LoanCase 
{
	@Id
	@Column(name = "loancaseid")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int loancaseid;
	@Column(name = "districe")
	private String districtname;
	@Column(name = "casenumber")
	private String casenumber;
	public String getDistrictname() {
		return districtname;
	}
	public void setDistrictname(String districtname) {
		this.districtname = districtname;
	}
	public String getCasenumber() {
		return casenumber;
	}
	public void setCasenumber(String casenumber) {
		this.casenumber = casenumber;
	}
	public LoanCase(int loancaseid, String districtname, String casenumber) {
		this.loancaseid = loancaseid;
		this.districtname = districtname;
		this.casenumber = casenumber;
	}
	@Override
	public String toString() {
		return "LoanCase [loancaseid=" + loancaseid + ", districtname=" + districtname + ", casenumber=" + casenumber
				+ "]";
	}
	
	public LoanCase() {
		// TODO Auto-generated constructor stub
	}
	
}
