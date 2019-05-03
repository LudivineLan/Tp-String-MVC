package com.infotel.TpSpringMVC.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.infotel.TpSpringMVC.metier.Adresse;

@Transactional
public interface AdresseRepository extends JpaRepository<Adresse, Integer> {
	@Modifying
	@Query ("UPDATE Adresse SET nomRue = :x, numRue = :y, cp = :z, ville = :b where idAdresse= :c ")
	public int modifierAdresse(@Param ("x")String nomRue, @Param ("y")String numRue, @Param("z")String cp, @Param("b")String ville, @Param("c")int idAdresse);

}
