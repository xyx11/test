package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController的意思就是controller里面的方法都以json格式输出
@RestController
public class HelloWorldController {
    @RequestMapping("hello")
    public String index(){
        return "hellowrod";
    }
}
