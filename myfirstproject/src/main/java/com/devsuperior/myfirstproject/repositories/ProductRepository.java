package com.devsuperior.myfirstproject.repositories;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.devsuperior.myfirstproject.entities.Product;

@Component   /*Injecao de dependencia - funciona com o @Autowired*/
public class ProductRepository {
	
	/*Map - Coleção de pares chave valor*/
	/*Guardando na memória*/
	private Map<Long, Product> map = new HashMap<>();

	public void save(Product obj) {
		map.put(obj.getId(), obj);
	}

	public Product findById(Long id) {
		return map.get(id);
	}
	
	public List<Product> findAll() {
		return new ArrayList<Product>(map.values());
	}

}
