package com.example.first_project.controllers;
import com.example.first_project.repositories.UserRepository;
import com.example.first_project.entities.User;
import com.example.first_project.entities.UserContainer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;
    @GetMapping()
    public List<User> getAllUsers(){ return userRepository.getAllByUsername("asdf");
    }

    @PostMapping()
    public void creatUser(@RequestBody List<User> user){
        userRepository.saveAll(user);
    }

    @PostMapping("/{id}")
    public UserContainer testPost(@RequestBody UserContainer user, @PathVariable int id, @RequestParam("serialNumber") int serialNumber){
        final UserContainer userContainer = new UserContainer();
        userContainer.setId(id);
        userContainer.setSerialNumber(serialNumber);
        userContainer.setUser(user.getUser());
        return userContainer;
    }

}
