package com.lucio.cursomc.apirest.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lucio.cursomc.apirest.domain.Categoria;
import com.lucio.cursomc.apirest.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {  
		Optional<Categoria> obj = repo.findById(id);  
		return obj.orElse(null);
		
	}

	public List<Categoria> buscarTodas() {  
		List<Categoria> objs = repo.findAll();  
		return objs;	
	}
	

}
