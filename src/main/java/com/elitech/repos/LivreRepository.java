package com.elitech.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.elitech.model.Livre;

public interface LivreRepository extends JpaRepository<Livre, Long> {

}
