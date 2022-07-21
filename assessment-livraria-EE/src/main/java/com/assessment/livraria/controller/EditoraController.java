package com.assessment.livraria.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.assessment.livraria.model.Editora;
import com.assessment.livraria.service.EditoraService;

@Controller
public class EditoraController {
	
	private EditoraService editoraService;

	public EditoraController(EditoraService editoraService) {
		super();
		this.editoraService = editoraService;
	}
	
	@GetMapping("/editoras")
	public String listEditoras(Model model) {
		model.addAttribute("editoras",editoraService.getAllEditoras());
		return "editoras";
	}
	
	@GetMapping("editoras/novo")
	public String createEditora(Model model) {
		Editora editora = new Editora();
		model.addAttribute("editora",editora);
		return "create_editoras";
	}
	
	@PostMapping("/editora")
	public String saveEditora(@ModelAttribute("editora") Editora editora) {
		editoraService.saveEditora(editora);
		return "redirect:/editoras";
	}
	
	@GetMapping("/editoras/edit/{id}")
	public String editEditora(@PathVariable Long id, Model model) {
		model.addAttribute("editora", editoraService.getEditoraById(id));
		return "edit_editora";
	}
	
	@PostMapping("editoras/{id}")
	public String updateeditora(@PathVariable Long id,
			@ModelAttribute("editora") Editora editora,
			Model model) {
		
		Editora existEditora = editoraService.getEditoraById(id);
		existEditora.setId(id);
		existEditora.setNome(editora.getNome());
		
		
		editoraService.updateEditora(existEditora);
		
		return "redirect:/editoras";
	}
	
	@GetMapping("/editoras/{id}")
	public String deleteEditora(@PathVariable Long id) {
		editoraService.deleteEditoraById(id);
		return "redirect:/editoras";
	}
}
