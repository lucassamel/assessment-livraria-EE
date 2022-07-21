package com.assessment.livraria.service;

import java.util.List;

import com.assessment.livraria.model.Usuario;

public interface UsuarioService {
	
	List<Usuario> getAllUsuario();

	Usuario saveUsuario(Usuario usuario);
	
	Usuario getUsuarioById(Long id);
	
	//Usuario validateUser(Login login);
}
