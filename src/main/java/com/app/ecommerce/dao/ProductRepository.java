package com.app.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.app.ecommerce.Entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long> {
	

}
