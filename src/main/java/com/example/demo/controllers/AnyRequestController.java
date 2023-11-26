package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/anyReq")
public class AnyRequestController {

    @GetMapping
    public String xyz(){
        return "another roles";
    }
}
