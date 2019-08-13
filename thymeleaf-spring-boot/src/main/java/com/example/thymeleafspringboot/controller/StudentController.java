package com.example.thymeleafspringboot.controller;

import com.example.thymeleafspringboot.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * This is to demo use of a model in Thymeleaf and displaying a list.
 */
@Controller
public class StudentController {

    @RequestMapping("students")
    public String students(Model model) {
        List<Student> lst = new ArrayList<>();
        lst.add(new Student(1, "Tom", 30));
        lst.add(new Student(2, "Jerry", 29));
        lst.add(new Student(3, "Nancy", 27));
        model.addAttribute("list", lst);
        return "students";
    }
}
