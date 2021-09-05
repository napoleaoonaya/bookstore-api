package br.com.onaya.bookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.onaya.bookstore.domain.Livro;

public interface LivroRepository extends JpaRepository<Livro, Integer> {

}
