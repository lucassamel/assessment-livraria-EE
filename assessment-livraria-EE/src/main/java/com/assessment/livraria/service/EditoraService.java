package com.assessment.livraria.service;

import java.util.List;

import com.assessment.livraria.model.Editora;

public interface EditoraService {

	List<Editora> getAllEditoras(); 
	
	Editora saveEditora(Editora editora);
	
	Editora updateEditora(Editora editora);
	
	Editora getEditoraById(Long id);
	
	void deleteEditoraById(Long id);
}
