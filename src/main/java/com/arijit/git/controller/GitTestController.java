package com.arijit.git.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GitTestController {

    @GetMapping("/hello?/{name}")
    public String sayHello(@PathVariable String name){
        System.out.println("Commit from master 2 and from master 1");
        return "Hello "+name;
    }
}
