package com.arijit.git.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GitTestController {

    @GetMapping("/hello?/{name}")
    public String sayHello(@PathVariable String name){
        System.out.println("Commit from master 2 and from master 1");
        System.out.println("another commit from master 2 after rebase 2");
        System.out.println("another commit from master 3 after rebase 1");
        System.out.println("another commit from master 4 after rebase 1");
        System.out.println("another commit from master 5 after rebase 1");
        return "Hello "+name;
    }

    @GetMapping("/hello2?/{name}")
    public String sayHello2(@PathVariable String name){
        System.out.println("New Commit from master 1 ");
        return "Hello "+name;
    }
}
