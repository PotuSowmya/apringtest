package com.example.demo3;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo3.service.RandomNameGenerator;

//By implementing the CommandLineRunner, the run() method of the MyRunner class will be executed after the application starts
@Component
public class MyRunner implements CommandLineRunner {
    
    private static final Logger logger = LoggerFactory.getLogger(MyRunner.class);

    //MyRunner is also decorated with @Component, so it will be autodetected and registered as well
    //With the @Autowired annotation, we inject the RandomNameGenerator bean into the randGenerator field
    @Autowired
    private RandomNameGenerator randGenerator;

    @Override
    public void run(String... args) {
        
        logger.info("Generating random name: {}", randGenerator.generate());
        logger.info("Generating random name: {}", randGenerator.generate());
        logger.info("Generating random name: {}", randGenerator.generate());
    }

}