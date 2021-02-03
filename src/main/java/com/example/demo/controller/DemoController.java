package com.example.demo.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class DemoController {

    @GetMapping("/hello-world")
    public String helloWorld() {
        return "Hello world!!";
    }
}
