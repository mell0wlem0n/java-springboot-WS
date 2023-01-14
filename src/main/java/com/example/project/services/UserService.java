package com.example.project.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

import com.example.project.entities.User;
import com.example.project.repositories.UserRepository;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers(){
        final List<User> users = userRepository.findAll();
        return users.stream().filter(user -> "Ion".equals(user.getUsername())).collect(Collectors.toList());
    }

    public User createUser(User user){
        return userRepository.save(user);
    }
}
