package com.infotel.TpSpringMVC.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infotel.TpSpringMVC.dao.AdresseRepository;
import com.infotel.TpSpringMVC.dao.PersonneRepository;
import com.infotel.TpSpringMVC.metier.Adresse;
import com.infotel.TpSpringMVC.metier.Personne;



@Service(value="service")
public class ServiceImpl implements IService {

	@Autowired
	PersonneRepository personneRepository;
	@Autowired
	AdresseRepository adresseRepository;
	
	

	public AdresseRepository getAdresseRepository() {
		return adresseRepository;
	}

	public void setAdresseRepository(AdresseRepository adresseRepository) {
	this.adresseRepository = adresseRepository;
	}

	public PersonneRepository getPersonneRepository() {
		return personneRepository;
	}

	public void setPersonneRepository(PersonneRepository personneRepository) {
		this.personneRepository = personneRepository;
	}

	@Override
	public Personne ajouterPersonne(Personne p) {
		// TODO Auto-generated method stub
		return personneRepository.save(p);
	}

	@Override
	public int modifierPersonne(String nom, String prenom,int age,int  idPersonne) {
		// TODO Auto-generated method stub
		return personneRepository.modifierPersonne(nom, prenom, age, idPersonne);
		
	}
	@Override
	public int modifierPersonne2 (Personne p) {
	 personneRepository.save(p);
	 return 1;
	}

	@Override
	public void supprimerPersonne(Personne p) {
		// TODO Auto-generated method stub
		 personneRepository.delete(p);
	}

	@Override
	public Personne getPersonne(int idPersonne) {
		// TODO Auto-generated method stub
		return personneRepository.findById(idPersonne).get();
	}

	@Override
	public Iterable<Personne> findAllPErsonne() {
		// TODO Auto-generated method stub
		return personneRepository.findAll();
	}

	@Override
	public Optional<Personne> affichagePersonne(int idPersonne) {
		// TODO Auto-generated method stub
		return personneRepository.findById(idPersonne);
	}
	
	@Override
	public void supprimerPersonneById(int idPersonne) {
		 personneRepository.deleteById(idPersonne);
		
	}
	
//	@Override
	public int modifierAdresse(Adresse adresse, int idPersonne) {
		// TODO Auto-generated method stub
		return personneRepository.modifierAdresse(adresse, idPersonne);
	}

////	@Override
//	public List<Personne> chercherParPrenom(String prenom) {
//		// TODO Auto-generated method stub
//		return personneRepository.findByPrenom(prenom);
//	}
//
////	@Override
//	public List<Personne> contientDansLePrenom(String prenom) {
//		// TODO Auto-generated method stub
//		return personneRepository.findByPrenomContaining(prenom);
//	}
//
////	@Override
//	public List<Personne> rechercherParMc(String nom) {
//		// TODO Auto-generated method stub
//		return personneRepository.rechercherParMc("%"+nom+"%");
//	}


	//Adresse
	@Override
	public Adresse ajouterAdresse(Adresse a) {
		// TODO Auto-generated method stub
		return adresseRepository.save(a);
	}

	@Override
	public int modifierAdresse(String nomRue, String numRue, String cp, String ville, int idAdresse) {
		// TODO Auto-generated method stub
		return adresseRepository.modifierAdresse(nomRue, numRue, cp, ville, idAdresse);
		
	}

	@Override
	public void supprimerAdresse(int idAdresse) {
		// TODO Auto-generated method stub
		adresseRepository.deleteById(idAdresse);
	}

	@Override
	public Adresse getAdresse(int idAdresse) {
		// TODO Auto-generated method stub
		return adresseRepository.findById(idAdresse).get();
	}
	
	@Override
	public Iterable<Adresse> findAllAdresse() {
		// TODO Auto-generated method stub
		return adresseRepository.findAll();
	}

	@Override
	public Optional<Adresse> affichageAdresse(int idAdresse) {
		// TODO Auto-generated method stub
		return adresseRepository.findById(idAdresse);
	}

	@Override
	public int modifierAdresse2(Adresse a) {
		// TODO Auto-generated method stub
		adresseRepository.save(a);
		return 1;
	}

	

}
