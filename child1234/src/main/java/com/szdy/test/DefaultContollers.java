package com.szdy.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultContollers {
    @GetMapping(value = "/")
    public String hello(){
        return "hello world!";
    }
}
