package com.assessment.livraria;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import com.assessment.livraria.model.Livro;
import com.assessment.livraria.repository.EditoraRepository;
import com.assessment.livraria.repository.LivroRepository;

@SpringBootApplication
public class AssessmentLivrariaEeApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(AssessmentLivrariaEeApplication.class, args);
	}

	@Autowired
	private LivroRepository livroRepository;
	
	@Autowired
	private EditoraRepository editoraRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
//		Livro livro1 = new Livro("As Aventura de TimTim","Jorge","Infantil");
//		livroRepository.save(livro1);
//		
//		Livro livro2 = new Livro("Cronicas de Narnia","Pedro","Infantil");
//		livroRepository.save(livro2);
//		
//		Livro livro3 = new Livro("Lirvo 3","Maria","Infantil");
//		livroRepository.save(livro3);
	}
	
	

}
