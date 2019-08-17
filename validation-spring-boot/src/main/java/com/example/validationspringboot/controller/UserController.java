package com.example.validationspringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.validationspringboot.user.User;

import javax.validation.Valid;

@Controller
public class UserController {

    @RequestMapping("add")
    public String toAdd(User user) {
        return "add";
    }

    @RequestMapping("addUser")
    public String add(@Valid User user, BindingResult result) {  //The @Valid inject standard
        // validation rules and BindingResult connects the result to the view
        if (result.hasErrors()) {
            return "add";
        }
        System.out.println("Save user =" + user);
        return "success";
    }
}
