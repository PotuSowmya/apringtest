package com.example.demo3.service;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Component;

//The RandomNameGenerator is a Java class decorated with @Component. It will be detected during component scan process and registered as a Spring bean
@Component
public class RandomNameGenerator {

    public String generate() {

        List<String> names = Arrays.asList("Peter", "Roland", "Lucy", "Robert", "Jane");

        Random r = new Random();
        int i = r.nextInt(names.size());

        return names.get(i);
    }
}
