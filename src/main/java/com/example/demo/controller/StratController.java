package com.example.demo.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/start")
public class StratController {
    @RequestMapping("/springboot")
    public String startSpringBoot() {
        return "Welcome to the world of Spring Boot33333333333!";
    }
}
