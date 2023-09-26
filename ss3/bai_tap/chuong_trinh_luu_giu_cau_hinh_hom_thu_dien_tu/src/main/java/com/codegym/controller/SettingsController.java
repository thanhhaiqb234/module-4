package com.codegym.controller;

import com.codegym.model.Settings;
import com.codegym.service.ISettingsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/settings")
public class SettingsController {

    @Autowired
    private ISettingsService settingsService;
    @GetMapping("/list")
    public ModelAndView showMail(Model model){
        List<Settings> settingsList = settingsService.showMail();
        ModelAndView modelAndView =new ModelAndView("index","settingsList",settingsList);
        return modelAndView;
    }


}
