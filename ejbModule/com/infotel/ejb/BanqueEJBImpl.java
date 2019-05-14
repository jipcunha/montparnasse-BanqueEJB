package com.infotel.ejb;

import java.util.ArrayList;
import java.util.Date;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;

import com.infotel.metier.Compte;

@Singleton
public class BanqueEJBImpl implements IBanqueLocal, IBanqueRemote {


	private Map<Long, Compte> comptes = new Hashtable<Long, Compte>();
	
	@Override
	public void addCompte(Compte c) {
		comptes.put(c.getCode(), c);

	}

	@Override
	public List<Compte> consulterComptes() {
		List<Compte> cptes = new ArrayList<Compte>(comptes.values());
		return cptes;
	}

	@Override
	public Compte consulterCompte(long code) {
		Compte cp = comptes.get(code);
		if (cp==null) throw new RuntimeException("Compte introuvables");
		return cp;
	}

	@Override
	public void verser(long code, double montant) {
		Compte cp = comptes.get(code);
		cp.setSolde(cp.getSolde() + montant);

	}

	@Override
	public void retirer(long code, double montant) {
		Compte cp = comptes.get(code);
		if(montant > cp.getSolde()) throw new RuntimeException("solde insuffisant");
		cp.setSolde(cp.getSolde() - montant);
	}

	//apres la construction de l'ejb, initialization
	@PostConstruct
	public void inititialization() {
		addCompte(new Compte(1L, 7000, new Date())); //new Date est la date d'aujourd'hui
		addCompte(new Compte(2L, 7000, new Date()));
		addCompte(new Compte(3L, 7000, new Date()));
		
	}
}
