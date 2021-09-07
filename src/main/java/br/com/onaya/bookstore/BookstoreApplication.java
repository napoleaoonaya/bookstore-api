package br.com.onaya.bookstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;

import br.com.onaya.bookstore.config.DevConfig;
import br.com.onaya.bookstore.domain.Categoria;
import br.com.onaya.bookstore.domain.Livro;
import br.com.onaya.bookstore.service.DBService;

@SpringBootApplication
@EnableConfigurationProperties
@EntityScan(basePackages = {"br.com.onaya.bookstore"})
@ComponentScan(basePackages = {"br.com.onaya.bookstore"})
@ComponentScan(basePackageClasses={DevConfig.class, DBService.class, Livro.class, Categoria.class})
public class BookstoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}

}
