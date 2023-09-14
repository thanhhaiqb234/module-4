package com.codegym.controller;

import com.codegym.service.DictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DictionaryContrller {
    @Autowired
    private DictionaryService dictionaryService;

    @GetMapping("/dictionary")
    public String showdDictionary(){
        return "index";
    }


    @GetMapping("/search/dictionary")
    public String searchdictionary(@RequestParam String search, Model model){
        String result =  dictionaryService.searchResult(search);
        model.addAttribute("result",result);
        return "index";
    }
}
