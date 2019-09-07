package com.example.demo3.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo3.Animal;

@RestController  
@RequestMapping("/")  
public class FactoryController {  
  
    private AnimalFactory factory;  
  
    @Autowired  
    public FactoryController(AnimalFactory factory) {  
        this.factory = factory;  
    }  
  
    @PostMapping("addAminal/{type}/{name}")  
    public Animal addAnimal(@PathVariable String type, @PathVariable String name) {  
        Animal animal = this.factory.createAnimal(type);  
        animal.setName(name);
        animal.getType();
        animal.makeASound();  
        return animal;  
    }  
}
