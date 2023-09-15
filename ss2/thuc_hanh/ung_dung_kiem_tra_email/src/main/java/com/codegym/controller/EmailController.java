package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Controller
@RequestMapping("/email")
public class EmailController {
    private static final String REGEX_EMAIL = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
    private static Pattern pattern;


    public void HomeController() {
        pattern = Pattern.compile(REGEX_EMAIL);
    }
    @GetMapping("/")
    public String index() {
        return "index";
    }

    @PostMapping(value = "/validate")
    public String user(@RequestParam String email, Model modelMap) {
        boolean isValid = this.validate(email);
        if (!isValid) {
            modelMap.addAttribute("message", "Email is invalid ");
            return "index";
        }
        modelMap.addAttribute("email", email);
        return "success";
    }

    private boolean validate(String regex) {
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
