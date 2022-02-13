package com.devsuperior.myfirstproject.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.myfirstproject.entities.Product;
import com.devsuperior.myfirstproject.repositories.ProductRepository;

@RestController /*Para que o framework Spring Boot reconheça essa classe como um recurso rest */
@RequestMapping(value = "/products") /*Para mapeamento de URL - Caminho no qual esse recurso vai responder*/
public class ProductResources {

	/*Instancia do ProductRepository dentro do Product Repository*/
	@Autowired
	private ProductRepository categoryRepository;
	
	@GetMapping
	public ResponseEntity<List<Product>> findAll() {
		List<Product> list = categoryRepository.findAll();
		return ResponseEntity.ok().body(list);
	}

	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Product> findById(@PathVariable Long id) {
		Product cat = categoryRepository.findById(id);
		return ResponseEntity.ok().body(cat);
	}
	
}
