package br.com.onaya.bookstore.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.onaya.bookstore.domain.Categoria;
import br.com.onaya.bookstore.domain.Livro;
import br.com.onaya.bookstore.repository.CategoriaRepository;
import br.com.onaya.bookstore.repository.LivroRepository;

@Service
public class DBService {
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	@Autowired
	private LivroRepository livroRepository;
	
	public void instanciaBaseDeDados() {
		
		Categoria categoria1 = new Categoria(0, "Java", "Curso");
		Categoria categoria2 = new Categoria(0, "C#", "Curso");
		Categoria categoria3 = new Categoria(0, "Python", "Curso");
		Categoria categoria4 = new Categoria(0, "Ruby", "Curso");
		Categoria categoria5 = new Categoria(0, "PHP", "Curso");
		
		Livro livro1 = new Livro(0, "Spring Boot 2 e Angular 10", "Napoleão Kazu Onaya", "Lorem Ipsum", categoria1);
		Livro livro2 = new Livro(0, "C#", "Napoleão Kazu Onaya", "Lorem Ipsum", categoria2);
		Livro livro3 = new Livro(0, "Python e Django", "Napoleão Kazu Onaya", "Lorem Ipsum", categoria3);
		Livro livro4 = new Livro(0, "Ruby e Ruby on Rails", "Napoleão Kazu Onaya", "Lorem Ipsum", categoria4);
		Livro livro5 = new Livro(0, "PHP e Laravel", "Napoleão Kazu Onaya", "Lorem Ipsum", categoria5);
		
		categoria1.getLivros().addAll(Arrays.asList(livro1));
		categoria2.getLivros().addAll(Arrays.asList(livro2));
		categoria3.getLivros().addAll(Arrays.asList(livro3));
		categoria4.getLivros().addAll(Arrays.asList(livro4));
		categoria5.getLivros().addAll(Arrays.asList(livro5));
		
		categoriaRepository.saveAll(Arrays.asList(categoria1, categoria2, categoria3, categoria4, categoria5));
		livroRepository.saveAll(Arrays.asList(livro1, livro2, livro3, livro4, livro5));
		
		
	}
	

}
