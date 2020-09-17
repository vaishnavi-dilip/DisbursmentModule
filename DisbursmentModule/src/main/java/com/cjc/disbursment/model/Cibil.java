package com.cjc.disbursment.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(name = "CIbil_DB1")
public class Cibil 
{
	@Id
	@Column(name = "cibils_Score")
	private int score;
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "Cibil_id")
	private int cid;
	public Cibil() {
		// TODO Auto-generated constructor stub
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public Cibil(int score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "Cibil [score=" + score + ", cid=" + cid + "]";
	}
	
	

}
