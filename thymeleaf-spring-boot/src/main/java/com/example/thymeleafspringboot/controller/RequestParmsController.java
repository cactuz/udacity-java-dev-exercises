package com.example.thymeleafspringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Demo request parameters used as variables in the application.
 */
@Controller
public class RequestParmsController {

    @RequestMapping("parms")
    public String grades(Model model, @RequestParam("grade") double grade, @RequestParam("name")
            String
            name) {
        model.addAttribute("message", "Hello " + name);
        model.addAttribute("name", name);
        model.addAttribute("grade", grade);
        model.addAttribute("GPA", convertGPA(grade));

        return "parms";
    }

    @SuppressWarnings("Duplicates")
    private String convertGPA(double grade) {
        if (grade >= 90) {
            return "A";
        } else if (grade < 90 && grade >= 80) {
            return "B";
        } else if (grade < 80 && grade >= 70) {
            return "C";
        } else if (grade < 70 && grade >= 60) {
            return "D";
        } else {
            return "F";
        }
    }


}
