package com.assessment.livraria.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "livros")
public class Livro {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "titulo", nullable = false)
	private String titulo;
	@Column(name = "autor")
	private String autor;
	@Column(name = "genero")
	private String genero;

	@ManyToOne
	@JoinColumn(name = "editora_id")
	private Editora editora;

	public Livro() {

	}

	public Livro(Long id, String titulo, String autor, String genero, Editora editora) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.autor = autor;
		this.genero = genero;
		this.editora = editora;
	}

	public void setEditora(Editora editora) {
		this.editora = editora;
	}

	public Livro(Long id, String titulo, String autor, String genero) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.autor = autor;
		this.genero = genero;
	}

	public Livro(String titulo, String autor, String genero) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.genero = genero;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

}
