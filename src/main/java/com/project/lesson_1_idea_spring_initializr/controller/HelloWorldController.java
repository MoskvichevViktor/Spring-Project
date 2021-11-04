package com.project.lesson_1_idea_spring_initializr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {

    @RequestMapping(value = "/")
    public String helloWorldController() {
        return "index";
    }

}
