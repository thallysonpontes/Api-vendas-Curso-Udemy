package com.example.thallysonpontes.vendas;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@EntityScan({"com.example.thallysonpontes.vendas.model", "com.example.thallysonpontes.vendas.Service", "com.example.thallysonpontes.vendas.Repository"})
@SpringBootApplication
@RestController
public class VendasApplication {

    @Value("${application.name}")
    private String applicationName;

    @GetMapping("/hello")
    public String helloWorld(){
        return applicationName;
    }

    public static void main(String[] args) {
        SpringApplication.run(VendasApplication.class, args);
    }
}