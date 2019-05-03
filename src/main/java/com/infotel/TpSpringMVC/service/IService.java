package com.infotel.TpSpringMVC.service;

import java.util.List;
import java.util.Optional;

import com.infotel.TpSpringMVC.metier.Adresse;
import com.infotel.TpSpringMVC.metier.Personne;

public interface IService {
	
	public Personne ajouterPersonne(Personne p);
	public int modifierPersonne(String nom, String prenom,int age,int  idPersonne);
	public int modifierPersonne2 (Personne p);
	public void supprimerPersonne(Personne p);
	public Personne getPersonne(int idPersonne);
	public Iterable<Personne> findAllPErsonne();
	public Optional<Personne> affichagePersonne(int idPersonne);
	public void supprimerPersonneById(int idPersonne);
//	public List<Personne> chercherParPrenom(String prenom);
//	public List<Personne> contientDansLePrenom(String prenom);
//	public List<Personne> rechercherParMc(String nom);
//	public int modifierAdresse(Adresse adresse, int idPersonne); 
	
	
	public Adresse ajouterAdresse(Adresse a);
	public void supprimerAdresse(int idAdresse);
	public Adresse getAdresse(int idAdresse);
	public Iterable<Adresse> findAllAdresse();
	public Optional<Adresse> affichageAdresse(int idAdresse);
	public int modifierAdresse2 (Adresse a);
	public int modifierAdresse(String nomRue, String numRue, String cp, String ville, int idAdresse);
}
