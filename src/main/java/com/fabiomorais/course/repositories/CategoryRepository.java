package com.fabiomorais.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fabiomorais.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
