package com.codeup.groovy_spring.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

    @GetMapping("/")
    @ResponseBody
    public String hello() {
        return "home!";
    }

    @GetMapping("/home")
    public String welcome() {
        return "home";
    }



}