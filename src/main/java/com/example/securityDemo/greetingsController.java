package com.example.securityDemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class greetingsController {
    @GetMapping("/greet")
    public String greet() {
        return "Hello, World!";
    }
}
