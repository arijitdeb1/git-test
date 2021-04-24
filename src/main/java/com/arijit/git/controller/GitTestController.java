package com.arijit.git.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GitTestController {

    @GetMapping("/hello?/{name}")
    public String sayHello(@PathVariable String name){
        System.out.println("Commit from master 2 and from master 1");
        System.out.println("Commit from master 1 ate rebase");
        System.out.println("another commit from master 2 after rebase 2");
        return "Hello "+name;
    }
}
