package br.com.onaya.bookstore;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.onaya.bookstore.domain.Categoria;
import br.com.onaya.bookstore.domain.Livro;
import br.com.onaya.bookstore.repository.CategoriaRepository;
import br.com.onaya.bookstore.repository.LivroRepository;

@SpringBootApplication
public class BookstoreApplication implements CommandLineRunner{
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	@Autowired
	private LivroRepository livroRepository;

	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Categoria categoria1 = new Categoria(0, "Java", "Curso");
		Livro livro1 = new Livro(0, "Spring Boot 2 e Angular 10", "Napoleão Kazu Onaya", "Lorem Ipsum", categoria1);
		
		categoriaRepository.saveAll(Arrays.asList(categoria1));
		livroRepository.saveAll(Arrays.asList(livro1));
		
	}

}
