package com.example.form_dang_ky.controller;

import com.example.form_dang_ky.model.User;
import com.example.form_dang_ky.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/form")
public class UserController {

    @Autowired
    private IUserService userService;

    @GetMapping("/log-in")
    public String logInForm(Model model){
        User user = new User();
        model.addAttribute("user",user);
        return "index";
    }
}
