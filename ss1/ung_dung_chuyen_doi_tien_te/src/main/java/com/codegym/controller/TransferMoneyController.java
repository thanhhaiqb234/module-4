package com.codegym.controller;

import com.codegym.service.TransferMoneyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TransferMoneyController {
    @Autowired
    private TransferMoneyService transferMoneyService;

    @GetMapping("/show")
    public String show(){
        return "index";
    }
    @GetMapping("/transfer/money")
    public String sumUSD(@RequestParam int usd , Model model){
        double vnd =  transferMoneyService.sumUSD(usd);
        model.addAttribute("vnd",vnd);
        return "index";
    }
}
