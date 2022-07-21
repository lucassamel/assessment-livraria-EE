package com.assessment.livraria.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.assessment.livraria.model.Livro;
import com.assessment.livraria.service.LivroService;

@Controller
public class LivroController {

	private LivroService livroService;

	public LivroController(LivroService livroService) {
		super();
		this.livroService = livroService;
	}
	
	@GetMapping("/livros")
	public String listLivros(Model model) {
		model.addAttribute("livros",livroService.getAllLivros());
		return "livros";
	}
	
	@GetMapping("/livros/novo")
	public String creatLivro(Model model) {
		Livro livro = new Livro();
		model.addAttribute("livro",livro);
		return "create_livro";
	}
	
	@PostMapping("/livros")
	public String saveLivro(@ModelAttribute("livro") Livro livro) {
		livroService.saveLivro(livro);
		return "redirect:/livros";
	}
	
	@GetMapping("/livros/edit/{id}")
	public String editLivro(@PathVariable Long id, Model model) {
		model.addAttribute("livro", livroService.getLivroById(id));
		return "edit_livro";
	}
	
	@PostMapping("livros/{id}")
	public String updateLivro(@PathVariable Long id,
			@ModelAttribute("livro") Livro livro,
			Model model) {
		
		Livro existLivro = livroService.getLivroById(id);
		existLivro.setId(id);
		existLivro.setTitulo(livro.getTitulo());
		existLivro.setAutor(livro.getAutor());
		existLivro.setGenero(livro.getGenero());
		
		livroService.updateLivro(existLivro);
		
		return "redirect:/livros";
	}
	
	
	@GetMapping("/livros/{id}")
	public String deleteLivro(@PathVariable Long id) {
		livroService.deleteLivroById(id);
		return "redirect:/livros";
	}
}
