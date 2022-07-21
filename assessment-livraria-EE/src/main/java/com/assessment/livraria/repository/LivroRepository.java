package com.assessment.livraria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assessment.livraria.model.Livro;

public interface LivroRepository extends JpaRepository<Livro, Long>{

}
