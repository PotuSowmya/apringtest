package com.example.demo3.service;

import org.springframework.stereotype.Component;

import com.example.demo3.Animal;

@Component  
public class AnimalFactory {  
    public Animal createAnimal(String type) {  
        switch (type) {  
            case "bird":  
                return new Bird();  
            case "cat":  
                return new Cat();  
            default:  
                throw new UnsupportedOperationException("Unsupported animal type!");  
        }  
  
    }  
}
