package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = {"/home", "/", "/index"})
public class NoAuthController {


    @GetMapping
    public String abc() {
        return "No Authentication";
    }
}
