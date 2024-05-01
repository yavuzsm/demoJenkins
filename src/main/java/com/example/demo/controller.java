package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/deneme")
public class controller {
    @GetMapping
    public String deneme1(){
        return "adasdasdasd";
    }
}
