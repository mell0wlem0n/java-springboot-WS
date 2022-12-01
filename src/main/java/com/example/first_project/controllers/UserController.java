package com.example.first_project.controllers;

import com.example.first_project.entities.User;
import com.example.first_project.entities.UserContainer;
import jakarta.websocket.server.PathParam;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @GetMapping()
    public String getAllUsers(){
        return "OK";
    }
    @PutMapping()
    public User createUser(@RequestBody User user) {
        return user;

    }

    @PostMapping("/{id}")
    public UserContainer testPost(@RequestBody UserContainer user, @PathVariable UserContainer id, @RequestParam("serialNumber") UserContainer serialNumber){
        final UserContainer userContainer = new UserContainer();
        return userContainer;
    }
}
