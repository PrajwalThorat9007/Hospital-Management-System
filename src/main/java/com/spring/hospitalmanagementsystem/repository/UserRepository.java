package com.spring.hospitalmanagementsystem.repository;

import com.spring.hospitalmanagementsystem.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {

    // custom method
    Optional<User> findByEmail(String email);
}