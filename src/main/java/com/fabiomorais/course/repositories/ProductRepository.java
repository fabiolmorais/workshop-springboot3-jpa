package com.fabiomorais.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fabiomorais.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
