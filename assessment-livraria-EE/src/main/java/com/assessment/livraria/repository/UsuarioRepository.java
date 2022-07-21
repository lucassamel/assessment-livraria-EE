package com.assessment.livraria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assessment.livraria.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
