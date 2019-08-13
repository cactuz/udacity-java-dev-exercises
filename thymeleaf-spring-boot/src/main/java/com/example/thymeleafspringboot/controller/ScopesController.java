package com.example.thymeleafspringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * This is to demo scopes in Thymeleaf, where one can track data across different scopes:
 * request, session and application.
 */
@Controller
public class ScopesController {

    @RequestMapping("scopes")
    public String demo4(HttpServletRequest request, Model model) {
        // Request
        request.setAttribute("request", "request data");
        // Session
        request.getSession().setAttribute("session", "session data");
        // Application
        request.getSession().getServletContext().setAttribute("application", "application data");
        return "scopes";
    }
}
