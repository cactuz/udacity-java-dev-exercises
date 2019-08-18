package com.example.exceptionspringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

    /**
     * This generates the Arithmetic exception
     * @return
     */
    @RequestMapping("/add")
    public String add() {
        int num = 10 / 0;
        return "add";
    }

    /**
     * This method is to display a custom html for the Arithmetic exception from add()
     */
//    @ExceptionHandler(value={java.lang.ArithmeticException.class})
//    public ModelAndView handlerArithmeticException(Exception e) {
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.addObject("exception", e.toString());
//        modelAndView.setViewName("mathError");  //this maps to mathError.html
//        return modelAndView;
//    }

    @RequestMapping("/update")
    public String update() {
        String name = null;
        name = name.toLowerCase(); // this should cause null pointer exception & maps to an
        return "update";
    }

    /**
     * This is to handle the null pointer exception from update()
     */
//    @ExceptionHandler(value={java.lang.NullPointerException.class})
//    public ModelAndView handlerNullPointerException(Exception e) {
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.addObject("exception", e.toString());
//        modelAndView.setViewName("nullPointerError");
//        return modelAndView;
//    }
}
