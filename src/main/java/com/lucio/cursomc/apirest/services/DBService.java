package com.lucio.cursomc.apirest.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lucio.cursomc.apirest.domain.Categoria;
import com.lucio.cursomc.apirest.repositories.CategoriaRepository;

@Service
public class DBService {
	//
	@Autowired
	private CategoriaRepository repo;
	
	public void inicializarDB() {
		//
		Categoria c1 = new Categoria(null, "Informática");
		Categoria c2 = new Categoria(null, "Escritório");
		Categoria c3 = new Categoria(null, "Oficina");
		
//		repo.save(c1);  
//		repo.save(c2);  
//		repo.save(c3);  
		
		repo.saveAll(Arrays.asList(c1, c2, c3));
	}
	

}
