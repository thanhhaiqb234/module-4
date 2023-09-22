package com.example.mo_rong_ung_dung_blog.controller;

import com.example.mo_rong_ung_dung_blog.model.Blog;
import com.example.mo_rong_ung_dung_blog.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/blog")
public class BlogController {
    @Autowired
    private IBlogService service;
    @GetMapping("/list")
    public String showList(Model model){
        List<Blog> blogList = service.showList();
        model.addAttribute("blogList",blogList);
        return "list";
    }
}
