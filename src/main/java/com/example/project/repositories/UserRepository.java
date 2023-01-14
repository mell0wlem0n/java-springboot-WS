package com.example.project.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.project.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    
    List<User> getAllByUsername(final String username);

    User getFirstByUsername(final String username);
}
