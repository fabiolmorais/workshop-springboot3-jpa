package com.fabiomorais.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fabiomorais.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
