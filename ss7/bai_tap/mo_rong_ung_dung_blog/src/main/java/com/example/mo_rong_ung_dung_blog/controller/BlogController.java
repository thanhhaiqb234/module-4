package com.example.mo_rong_ung_dung_blog.controller;

import com.example.mo_rong_ung_dung_blog.model.Blog;
import com.example.mo_rong_ung_dung_blog.model.Category;
import com.example.mo_rong_ung_dung_blog.service.IBlogService;
import com.example.mo_rong_ung_dung_blog.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
@RequestMapping("/blog")
public class BlogController {
    @Autowired
    private IBlogService blogService;

    @Autowired
    private ICategoryService categoryService;
    @GetMapping("/list/{categoryId}")
    public String getBlogList(@PathVariable int categoryId, Model model){
        List<Blog> blogList =blogService.findAll(categoryId);
        model.addAttribute("blogList",blogList);
        return "detail";
    }
}
