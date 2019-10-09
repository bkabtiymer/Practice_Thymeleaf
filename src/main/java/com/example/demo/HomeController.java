package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String homePage(){
    return "index";
    }
    @RequestMapping("/2")
    public String babySit(){
        return "job";
    }
    @RequestMapping("/3")
    public String aboutUs(){
        return "about";
    }
}
