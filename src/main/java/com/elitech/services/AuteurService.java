package com.elitech.services;

import java.util.Optional;
import java.util.Set;

import com.elitech.model.Auteur;

public interface AuteurService {
public Set<Auteur> getAllAuteurs();
public Auteur addOneAuteur(Auteur auteur);
public Optional<Auteur> findOneAuteur(long id);
public void deleteOneAuteur(long id);
public void deleteAllAuteur();
}
