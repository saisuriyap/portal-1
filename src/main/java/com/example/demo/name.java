package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class name{
    private String studentName="IamNeo";
    @GetMapping("/name")
    public String getName(){
        return "Welcome "+ studentName+"!";
    }
}

