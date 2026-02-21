package com.example.demo.controller;

import com.example.demo.service.MyService;
import org.springframework.web.bind.annotation.*;

@RestController
public class MyController {

    private final MyService myService;

    public MyController(MyService myService) {
        this.myService = myService;

        System.out.println("MyController constructor");
    }

    @GetMapping("/")
    public String welcome() {
        return "Welcome to my Spring Boot Application!";
    }

    @GetMapping("/getName")
    public String getName() {
        return myService.getName();
    }
}