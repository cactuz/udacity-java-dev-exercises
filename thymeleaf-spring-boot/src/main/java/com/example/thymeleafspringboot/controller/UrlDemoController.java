package com.example.thymeleafspringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Demo Href in html
 */
@Controller
public class UrlDemoController {

    @RequestMapping("demo-url")
    public String demoUrl() {
        return "url";
    }
}
