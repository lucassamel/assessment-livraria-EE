package com.assessment.livraria.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.assessment.livraria.model.Usuario;
import com.assessment.livraria.repository.UsuarioRepository;
import com.assessment.livraria.service.UsuarioService;

@Service
public class UsuarioServicempl implements UsuarioService {

	private UsuarioRepository usuarioRepository;
	
	public UsuarioServicempl(UsuarioRepository usuarioRepository) {
		super();
		this.usuarioRepository = usuarioRepository;
	}

	@Override
	public Usuario saveUsuario(Usuario usuario) {
		return usuarioRepository.save(usuario);
	}

	@Override
	public Usuario getUsuarioById(Long id) {
		return usuarioRepository.findById(id).get();
	}

	@Override
	public List<Usuario> getAllUsuario() {
		return usuarioRepository.findAll();
	}

	/*
	 * @Override public Usuario validateUser(Login login) { return
	 * usuarioRepository.find; }
	 */

}
