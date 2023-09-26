package com.example.mo_rong_ung_dung_blog.controller;

import com.example.mo_rong_ung_dung_blog.model.Category;
import com.example.mo_rong_ung_dung_blog.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/category")
public class CategoryController {


    @Autowired
    private ICategoryService categoryService;


    @GetMapping("/list")
    public String listCategory(Model model){
        List<Category> categoryList = categoryService.showList();
        model.addAttribute("categoryList",categoryList);
        return "list_category";
    }

    @GetMapping("/edit/{id}")
    public String editCategory(@PathVariable int id , Model model){
        Category category = categoryService.editCategory(id);
        model.addAttribute("category",category);
        return "edit_category";
    }

    @GetMapping("/detail/{id}")
    public String getCategoryDetail(@PathVariable int id){
        return "redirect:/blog/list/"+id;
    }


}
