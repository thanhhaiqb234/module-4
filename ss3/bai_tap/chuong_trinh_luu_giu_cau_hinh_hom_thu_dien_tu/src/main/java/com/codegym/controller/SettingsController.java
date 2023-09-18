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
    public ModelAndView showMail(){
        List<Settings> settingsList = settingsService.showMail();
        ModelAndView modelAndView =new ModelAndView("index","settingsList",settingsList);
        return modelAndView;
    }
    @GetMapping("/setting/update/{id:[1-100]}")
    public String settingCreate(@PathVariable int id,Model model){
        List<Settings> settingsList = settingsService.search(id);
        List<String> stringList = settingsService.showLanguages();
        List<Integer> integerList = settingsService.showPageSize();
        model.addAttribute("settingsList",settingsList);
        model.addAttribute("stringList",stringList);
        model.addAttribute("integerList",integerList);
        return "update";
    }
}
