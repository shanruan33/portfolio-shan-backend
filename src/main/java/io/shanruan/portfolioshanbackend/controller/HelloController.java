package io.shanruan.portfolioshanbackend.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HelloController {

    @GetMapping(value="/")
    public String sayHello() {
        return new String("Hello World!");
    }
    
}