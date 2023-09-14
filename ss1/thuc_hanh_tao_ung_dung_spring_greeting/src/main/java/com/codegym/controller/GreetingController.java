package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class GreetingController {

    @GetMapping("/greeting")
    public String greeting(@RequestParam String name, Model model){
        name = "Đinh Thanh Hải";
        model.addAttribute("name" , name);
        return "index";
    }

    @GetMapping("/studen/create")
    public String showCreate(){
        return "create";
    }
}
