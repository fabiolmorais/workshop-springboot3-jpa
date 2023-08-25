package com.fabiomorais.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fabiomorais.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
