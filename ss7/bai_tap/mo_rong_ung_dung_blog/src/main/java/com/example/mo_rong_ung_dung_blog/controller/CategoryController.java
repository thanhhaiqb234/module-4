package com.example.mo_rong_ung_dung_blog.controller;

import com.example.mo_rong_ung_dung_blog.model.Category;
import com.example.mo_rong_ung_dung_blog.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
@RequestMapping("/category")
public class CategoryController {


    @Autowired
    private ICategoryService categoryService;


    @GetMapping("/list")
    public ModelAndView listCategory(@RequestParam(defaultValue = "0",required = false)int page,
                                     @RequestParam(defaultValue = "",required = false) String seachName){
        Pageable pageable =  PageRequest.of(page,3);
        Page<Category> categoryPage = categoryService.showList(pageable,seachName);
        ModelAndView modelAndView = new ModelAndView("list-category","categoryPage",categoryPage);
        return modelAndView;
    }

    @GetMapping("/edit/{id}")
    public String editCategory(@PathVariable int id , Model model){
        Category category = categoryService.editCategory(id);
        model.addAttribute("category",category);
        return "edit-category";
    }

    @GetMapping("/detail/{id}")
    public String getCategoryDetail(@PathVariable int id,RedirectAttributes redirectAttributes){
        return "redirect:/blog/list/"+id;
    }

    @PostMapping("/update")
    public String updateCategory(@ModelAttribute Category category , RedirectAttributes redirectAttributes){
        categoryService.updateCategory(category);
        return "redirect:/category/list";
    }

    @GetMapping("/delete/{id}")
    public String deleteCategory(@PathVariable int id , RedirectAttributes redirectAttributes){
        categoryService.deleteCategory(id);
        return "redirect:/category/list";
    }

}
