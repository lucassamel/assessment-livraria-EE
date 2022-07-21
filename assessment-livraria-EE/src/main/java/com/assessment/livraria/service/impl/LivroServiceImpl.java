package com.assessment.livraria.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.assessment.livraria.model.Livro;
import com.assessment.livraria.repository.LivroRepository;
import com.assessment.livraria.service.LivroService;

@Service
public class LivroServiceImpl implements LivroService{

	private LivroRepository	livroRepository;
	
	public LivroServiceImpl(LivroRepository livroRepository) {
		super();
		this.livroRepository = livroRepository;
	}

	@Override
	public List<Livro> getAllLivros() {
		return livroRepository.findAll();
	}

	@Override
	public Livro saveLivro(Livro livro) {
		return livroRepository.save(livro);
	}

	@Override
	public Livro updateLivro(Livro livro) {
		return livroRepository.save(livro);
	}

	@Override
	public Livro getLivroById(Long id) {
		return livroRepository.findById(id).get();
	}

	@Override
	public void deleteLivroById(Long id) {
		livroRepository.deleteById(id);
		
	}

}
