package com.infotel.ejb;

import java.util.List;

import javax.ejb.Local;

import com.infotel.metier.Compte;

@Local
public interface IBanqueLocal {

	public void addCompte(Compte c);
	public List<Compte> consulterComptes();
	public Compte consulterCompte(long code);
	public void verser(long code, double montant);
	public void retirer(long code, double montant);
}
