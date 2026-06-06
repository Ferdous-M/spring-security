package com.example.securityDemo;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class greetingsController {
    @GetMapping("/greet")
    public String greet() {
        return "Hello, World!";
    }

    @PreAuthorize("hasRole('USER')")
    @GetMapping("/user")
    public String greetUser() {
        return "Hello, user!";
    }

    @GetMapping("/admin")
    public String greetAdmin() {
        return "Hello, Admin!";
    }


}
