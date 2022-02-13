package com.devsuperior.myfirstproject.repositories;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.devsuperior.myfirstproject.entities.Product;

@Repository   /*Injecao de dependencia - funciona com o @Autowired*/
public interface ProductRepository extends JpaRepository<Product, Long>{
	


}
