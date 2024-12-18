package com.elitech.services;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.elitech.model.Livre;
import com.elitech.repos.AuteurRepository;
import com.elitech.repos.LivreRepository;

import lombok.RequiredArgsConstructor;
@Service
@RequiredArgsConstructor
public class LivreServiceImplement implements LivreService {

	private final LivreRepository livreRepository;
	private final AuteurRepository auteurRepository;
	
	@SuppressWarnings("unchecked")
	@Override
	public Set<Livre> getAllLivres() {
		// TODO Auto-generated method stub
		return (Set<Livre>) livreRepository.findAll();
	}

	@Override
	public Livre addOneLivre(Livre livre, long idAuteur) {
		// TODO Auto-generated method stub
		if(auteurRepository.existsById(idAuteur))
		{
		livre.setAuteur(auteurRepository.findById(idAuteur).get());
		
		return livreRepository.save(livre);
		}
		return null;
	}

	@Override
	public Livre findOneLivre(long id) {
		// TODO Auto-generated method stub
		return livreRepository.findById(id).orElse(null);
	}

	@Override
	public void deleteOneLivre(long id) {
		// TODO Auto-generated method stub
		livreRepository.deleteById(id);

	}

}
