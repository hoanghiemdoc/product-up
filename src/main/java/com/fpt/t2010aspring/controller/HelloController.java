package com.fpt.t2010aspring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "hello")
public class HelloController {
    @GetMapping(path = "world")
    public String say() {
        return "Hello World";
    }
    @GetMapping(path = "talk")
    public String talk() {
        return "Hello World";
    }


}
