package com.example.thymeleafspringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * This is to demo addition of variables.
 */
@Controller
public class GradeController {

    @RequestMapping("grade")
    public String demo2(Model model) {
        model.addAttribute("message", "Hello Thymeleaf");
        double grade = 40;
        model.addAttribute("grade", grade);
        model.addAttribute("GPA", convertGPA(grade));
        // return to templates/demo.html page.

        return "grade";
    }

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
