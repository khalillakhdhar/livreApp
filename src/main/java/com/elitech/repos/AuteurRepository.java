package com.elitech.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elitech.model.Auteur;

public interface AuteurRepository extends JpaRepository<Auteur, Long> {

}
