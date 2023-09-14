package com.codegym.controller;

import com.codegym.model.Customer;
import com.codegym.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CustomerController {
    @Autowired
    private ICustomerService customerService ;

    @GetMapping("/index")
    public String index(){
        return "index";
    }

    @GetMapping("/customer/list")
    public String showList(Model model){
        List<Customer> customerList = new ArrayList<>();
        customerList = customerService.showList();
        model.addAttribute("customerList",customerList);
        return "list";
    }
}
