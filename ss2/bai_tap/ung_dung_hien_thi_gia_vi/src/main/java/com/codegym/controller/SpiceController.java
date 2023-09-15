package com.codegym.controller;
import com.codegym.service.ISpiceService;
import com.sun.scenario.effect.Blend;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/spice")
public class SpiceController {

    @Autowired
    private ISpiceService spiceService;
    @GetMapping("/index")
    public String showIndex(){
        return "index";
    }
    @PostMapping("/spice")
    public String chooseSpices(@RequestParam(value = "spice",required = false,defaultValue = "Please choose") String[] spices,Model model){
        String[] spice = spiceService.checkSpice(spices);
        model.addAttribute("spice",spice);
        return "index";
    }
}
