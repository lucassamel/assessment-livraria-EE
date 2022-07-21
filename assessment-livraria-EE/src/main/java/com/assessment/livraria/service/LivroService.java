package com.assessment.livraria.service;

import java.util.List;

import com.assessment.livraria.model.Livro;

public interface LivroService {
	List<Livro> getAllLivros();
		
	Livro saveLivro(Livro livro);
	
	Livro updateLivro(Livro livro);
	
	Livro getLivroById(Long id);
	
	void deleteLivroById(Long id);
}
