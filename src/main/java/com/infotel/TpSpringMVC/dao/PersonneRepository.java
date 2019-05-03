package com.infotel.TpSpringMVC.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.infotel.TpSpringMVC.metier.Adresse;
import com.infotel.TpSpringMVC.metier.Personne;


@Transactional
public interface PersonneRepository  extends JpaRepository<Personne, Integer> {
	
	//Les requêtes dépendantes des attributs
	public List<Personne> findByPrenom(String prenom);
	public List<Personne> findByPrenomContaining (String prenom);
	
	//Les requêtes nommées
	@Query("select p from Personne p where p.nom like :x")
	public List<Personne> rechercherParMc(@Param("x")String nom);
	
	@Modifying
	@Query("UPDATE Personne SET nom = :x ,prenom = :y ,age = :z  where idPersonne= :c ")
	public int modifierPersonne(@Param("x")String nom, @Param("y")String prenom, @Param("z")int age , @Param("c")int idPersonne);
	
	@Modifying
	@Query("UPDATE Personne SET adresse = :x where idPersonne = :y")
	public int modifierAdresse(@Param("x")Adresse adresse, @Param("y")int idPersonne);

}
