package com.arijit.git.service;

import org.springframework.stereotype.Service;

@Service
public class GitTestService {

    public void FirstService(String name){
        System.out.println("commit 1 for reset check by master 1");
        System.out.println("commit 3 for reset check by master 1");
    }

    public void SecondService(String name){
        System.out.println("commit 1 for reset check by master 1");
        System.out.println("commit 2 for reset check by master 1");
        System.out.println("commit 3 for reset check by master 1");
        System.out.println("commit 4 for reset check by master 1");
        System.out.println("commit 5 for reset check by master 1");
        System.out.println("commit 6 for reset check by master 1");


    }
}
