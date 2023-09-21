package com.example.products.controller;

import com.example.products.model.Product;
import com.example.products.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private IProductService productService;

    @GetMapping("/list")
    public String showList(Model model){
        List<Product> productList = productService.showList();
        model.addAttribute("productList",productList);
        return "list";
    }


    @GetMapping("/{id}/fromDetail")
    public String productDetail(@PathVariable int id,Model model){
        List<Product> productList = productService.productDetail(id);
        model.addAttribute("productList",productList);
        return "detail";
    }

    @GetMapping("/{id}/fromDelete")
    public String productDelete(@PathVariable int id, RedirectAttributes redirectAttributes){
        productService.productDelete(id);
        return "redirect:/product/list";
    }

    @GetMapping("/{id}/fromEdit")
    public String productEdit(@PathVariable int id,Model model){
        Product  product = productService.productEdit(id);
        model.addAttribute("product",product);
        return "edit";
    }
}
