package com.example.thymeleafspringboot.model;

public class Student {
    public Integer id;
    public String name;
    public Integer age;

    public Student(Integer id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}
