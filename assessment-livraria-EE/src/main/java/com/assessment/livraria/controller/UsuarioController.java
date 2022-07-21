package com.assessment.livraria.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.assessment.livraria.model.Login;
import com.assessment.livraria.model.Usuario;
import com.assessment.livraria.service.UsuarioService;

@Controller
public class UsuarioController {

	private UsuarioService usuarioService;

	public UsuarioController(UsuarioService usuarioService) {
		super();
		this.usuarioService = usuarioService;
	}

	@GetMapping("/login")
	public String login(Model model) {
		Usuario usuario = new Usuario();
		model.addAttribute("usuario", usuario);
		return "login";
	}

	@SuppressWarnings("unlikely-arg-type")
	@PostMapping("/login")
	public String entrar(@ModelAttribute("usuario") Login usuario) {
		
		List<Usuario> usuarios = usuarioService.getAllUsuario();
		
		if (usuarios.contains(usuario)) {
			return "redirect:/livros";
		} else {
			return "redirect:/editoras";
		}

	}

	@GetMapping("usuario/novo")
	public String saveUsuario(Model model) {
		Usuario usuario = new Usuario();
		model.addAttribute("usuario", usuario);
		return "create_account";
	}

	@PostMapping("/usuarios")
	public String createUsuario(@ModelAttribute("usuario") Usuario usuario) {
		usuarioService.saveUsuario(usuario);
		return "redirect:/login";
	}
}
