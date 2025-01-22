package com.example.demo.testclasses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
//@Scope(value = "prototype")
public class Alien {
    @Autowired
    @Qualifier("laptop")
    Laptop laptop;
    public Alien() {
        System.out.println("Objected Created");
    }

    int age;
    String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void show(){
        System.out.println("In show");
        laptop.compiling();
    }

    public static class AdminCredential {
        private  String userID;
        private String password;
    }
}
