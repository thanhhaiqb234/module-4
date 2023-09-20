package com.codegym.controller;

import com.codegym.model.Products;
import com.codegym.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductsController {

    @Autowired
    private IProductService productService;


    @GetMapping("")
    public String showList(Model model){
        List<Products> productsList = productService.showList();
        model.addAttribute("productsList" , productsList);
        return "list";
    }

    @GetMapping("/{id}/formDetail")
    public String detailProduct(@PathVariable int id, Model model){
        List<Products> productsList = productService.getProduct(id);
        return "detail";
    }
}
