package com.example.pilotlecture.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class controller {
    private Service

    //http://127.0.0.1:8899/
    @GetMapping(value = "/")
    public String demo(){
        return "Hello World";
    }
}
