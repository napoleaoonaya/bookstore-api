package br.com.onaya.bookstore.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.onaya.bookstore.domain.Categoria;
import br.com.onaya.bookstore.dto.CategoriaDTO;
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
	
	public List<Categoria> findAll() {
		return categoriaRepository.findAll();
	}
	
	public Categoria create(Categoria obj) {
		obj.setId(null);
		return categoriaRepository.save(obj);
	}

	public Categoria update(Integer id, CategoriaDTO objDto) {
		//Procura o id a ser atualizado
		Categoria obj = findById(id);
		
		//Atualiza os campos de nome e descricao
		obj.setNome(objDto.getNome());
		obj.setDescricao(objDto.getDescricao());
		
		//Salva
		return categoriaRepository.save(obj);
	}

	public void delete(Integer id) {
		//Procura o id a ser atualizado
		findById(id);
		categoriaRepository.deleteById(id);
	}
}