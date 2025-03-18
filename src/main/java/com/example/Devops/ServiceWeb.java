package com.example.Devops;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceWeb {
    @GetMapping("/")
    public String hello() {
        return "hello";
    }
}