package com.infotel.TpSpringMVC.metier;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope (value="prototype")
@Entity
public class Personne {
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private int idPersonne; 
	private String nom;
	private String prenom;
	private int age;
	
	@ManyToOne
	private Adresse adresse;
	
	public int getIdPersonne() {
		return idPersonne;
	}
	public void setIdPersonne(int idPersonne) {
		this.idPersonne = idPersonne;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
//	public Adresse getAdresse() {
//		return adresse;
//	}
//	public void setAdresse(Adresse adresse) {
//		this.adresse = adresse;
//	}

	@Override
	public String toString() {
		return "Personne [idPersonne=" + idPersonne + ", nom=" + nom + ", prenom=" + prenom + ", age=" + age + "]";
	}

}
