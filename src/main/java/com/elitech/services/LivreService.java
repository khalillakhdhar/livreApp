package com.elitech.services;

import java.util.Set;

import com.elitech.model.Livre;

public interface LivreService {
public Set<Livre> getAllLivres();
public Livre addOneLivre(Livre livre,long idAuteur);
public Livre findOneLivre(long id);
public void deleteOneLivre(long id);
}
