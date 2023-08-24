package com.fabiomorais.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fabiomorais.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
