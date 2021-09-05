package br.com.onaya.bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.onaya.bookstore.domain.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {

}
