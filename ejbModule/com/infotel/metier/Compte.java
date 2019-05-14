package com.infotel.metier;

import java.io.Serializable;
import java.util.Date;


public class Compte implements Serializable {
	private long code;
	private double solde;
	private Date dateCreation;
	
	
	public long getCode() {
		return code;
	}
	public void setCode(long code) {
		this.code = code;
	}
	public double getSolde() {
		return solde;
	}
	public void setSolde(double solde) {
		this.solde = solde;
	}
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	@Override
	public String toString() {
		return "Compte [code=" + code + ", solde=" + solde + ", dateCreation=" + dateCreation + "]";
	}
	
	public Compte(long code, double solde, Date dateCreation) {
		super();
		this.code = code;
		this.solde = solde;
		this.dateCreation = dateCreation;
	}
	public Compte() {
		super();
	}
	
	
}
