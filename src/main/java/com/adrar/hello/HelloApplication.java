package com.adrar.hello;

import com.adrar.hello.service.HelloworldService;
import com.adrar.hello.service.LivreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloApplication implements CommandLineRunner {

    @Autowired
    HelloworldService helloworldService;

    @Autowired
    LivreService livreService;

    public static void main(String[] args) {
        SpringApplication.run(HelloApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        livreService.add();
    }
}
