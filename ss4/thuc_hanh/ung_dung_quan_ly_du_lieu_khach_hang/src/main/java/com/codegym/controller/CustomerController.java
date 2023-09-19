package com.codegym.controller;


import com.codegym.model.Customer;
import com.codegym.service.CustomerService;
import com.codegym.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private final ICustomerService customerService = new CustomerService();


    @GetMapping("")
    public String index(Model model){
        List<Customer> customerList = customerService.findAll();
        model.addAttribute("customerList",customerList);
        return "index";
    }
}
