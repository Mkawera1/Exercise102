package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String homepage(Model model){
        model.addAttribute("myvar","Jumbo everyone.");
        model.addAttribute("myval","Great day.");
        return "hometemplate";
    }
}
