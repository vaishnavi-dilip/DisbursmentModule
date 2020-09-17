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
@Table(name="tenure_DB1")
public class Tenure{
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int tenure_id;
	private int no_of_years;
	public int getTenure_id() {
		return tenure_id;
	}
	public void setTenure_id(int tenure_id) {
		this.tenure_id = tenure_id;
	}
	public int getNo_of_years() {
		return no_of_years;
	}
	public void setNo_of_years(int no_of_years) {
		this.no_of_years = no_of_years;
	}
	
	public Tenure() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Tenure [tenure_id=" + tenure_id + ", no_of_years=" + no_of_years + "]";
	}	
	
}
