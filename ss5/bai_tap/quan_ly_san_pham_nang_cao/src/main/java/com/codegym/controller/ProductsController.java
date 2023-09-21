package com.codegym.controller;

import com.codegym.model.Products;
import com.codegym.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
        Products products = productService.getProduct(id);
        model.addAttribute("products",products);
        return "detail";
    }

    @PostMapping("/create")
    public String addProduct(@ModelAttribute Products products, RedirectAttributes redirectAttributes) {
        productService.addProduct(products);
        return "redirect:/product";
    }
    @GetMapping("/create")
    public String createProduct(Model model){
        model.addAttribute("products",new Products());
        return "create";
    }

    @GetMapping("/{id}/delete")
    public String deleteProduct(@PathVariable int id){
        productService.delete(id);
        return "redirect:/product";
    }


}
