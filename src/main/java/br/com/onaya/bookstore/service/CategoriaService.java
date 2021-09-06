package br.com.onaya.bookstore.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.onaya.bookstore.domain.Categoria;
import br.com.onaya.bookstore.exceptions.ObjectNotFoundException;
import br.com.onaya.bookstore.repository.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository categoriaRepository;

	public Categoria findById(Integer id) {
		Optional<Categoria> obj = categoriaRepository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! - id: "+ id + " - Tipo: "+ Categoria.class.getName()));
	}
}
