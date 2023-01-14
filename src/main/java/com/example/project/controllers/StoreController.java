package com.example.project.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.entities.Store;
import com.example.project.repositories.StoreRepository;

@RestController
@RequestMapping("/store")
public class StoreController {
    
    @Autowired
    private StoreRepository repository;

    @PostMapping
    public Store create(@RequestBody final Store store){
        return repository.save(store);
    }

    @GetMapping
    public List<Store> getAll(){
        return repository.findAll();
    }
}


