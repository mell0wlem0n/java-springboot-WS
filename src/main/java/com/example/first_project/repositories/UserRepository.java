package com.example.first_project.repositories;

import com.example.first_project.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface UserRepository extends JpaRepository<User, Long> {
    List<User>getAll();
    List<User> getAllByUsername(final String username);
}
