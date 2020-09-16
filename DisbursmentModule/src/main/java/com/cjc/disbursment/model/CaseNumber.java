package com.cjc.disbursment.model;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "casenumber_DB")
public class CaseNumber 
{	
	@Id
	@Column(name = "caseid")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int caseid;
	@Column(name = "district")
	private String district;
	@Column(name = "case_number")
	private String caseno;
	
	
	
//	private int defaultlength=4;
	
	public CaseNumber(String district)
	{
		this.district=district;
		this.caseno=district.substring(0, 2)+UUID.randomUUID().toString().substring(0, 4);
		System.out.println("====================================");
		System.out.println("CASE NUMBER : " + caseno);
		System.out.println("====================================");
	}
	
	/*
	 * private String randomno(String length) { String
	 * no="gsdhdkskllasasl78961236547890"; String case1=""; char[]rn=new char[4];
	 * 
	 * for(int i=0;i<4;i++) { int r=(int)(Math.random()*no.length());
	 * case1=district.substring(0,3)+""+r;
	 * 
	 * } return case1;
	 * 
	 * }
	 */

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getCaseno() {
		return caseno;
	}

	public void setCaseno(String caseno) {
		this.caseno = caseno;
	}


	@Override
	public String toString() {
		return "Casenumber [caseid=" + caseid + ", district=" + district + ", caseno=" + caseno 
				 + "]";
	}
	public CaseNumber() {
		// TODO Auto-generated constructor stub
	}

	public CaseNumber(int caseid, String district) {
		this.caseid = caseid;
		this.district = district;
		appendCase(district);
		//this.caseno = caseno;
	}
	
	public String appendCase(String district)
	{
		String []s1=district.split(district,2);
		
		caseno=s1[0];
		
		System.out.println("CASE_NO"+caseno+String.valueOf(UUID.randomUUID().toString().substring(0, 4)));
		
	    return caseno+String.valueOf(UUID.randomUUID().toString().substring(0, 4));
		
	}
}
