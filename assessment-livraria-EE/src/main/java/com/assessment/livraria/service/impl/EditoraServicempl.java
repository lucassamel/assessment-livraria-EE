package com.assessment.livraria.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.assessment.livraria.model.Editora;
import com.assessment.livraria.repository.EditoraRepository;
import com.assessment.livraria.service.EditoraService;

@Service
public class EditoraServicempl implements EditoraService {

	private EditoraRepository editoraRepository;

	public EditoraServicempl(EditoraRepository editoraRepository) {
		super();
		this.editoraRepository = editoraRepository;
	}

	@Override
	public List<Editora> getAllEditoras() {
		return editoraRepository.findAll();
	}

	@Override
	public Editora saveEditora(Editora editora) {
		return editoraRepository.save(editora);
	}

	@Override
	public Editora updateEditora(Editora editora) {
		return editoraRepository.save(editora);
	}

	@Override
	public Editora getEditoraById(Long id) {
		return editoraRepository.findById(id).get();
	}

	@Override
	public void deleteEditoraById(Long id) {
		editoraRepository.deleteById(id);
	}



}
