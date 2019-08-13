package com.example.thymeleafspringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller  //required
public class SimpleController {

    @RequestMapping("simple")   //required
    public String demo(Model model) {
        model.addAttribute("message", "Hello Thymeleaf");
        return "demo";  //maps to demo.html from /templates
    }
}
