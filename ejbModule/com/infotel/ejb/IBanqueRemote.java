package com.infotel.ejb;

import java.util.List;

import javax.ejb.Remote;

import com.infotel.metier.Compte;

@Remote
public interface IBanqueRemote {
	
	public void addCompte(Compte c);
	public List<Compte> consulterComptes();
	public Compte consulterCompte(long code);
	public void verser(long code, double montant);
	public void retirer(long code, double montant);
	
}
