package com.example.mo_rong_ung_dung_blog.controller;

import com.example.mo_rong_ung_dung_blog.model.Blog;
import com.example.mo_rong_ung_dung_blog.service.IBlogService;
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

import java.util.List;


@Controller
@RequestMapping("/blog")
public class BlogController {


    @Autowired
    private IBlogService blogService;


    @GetMapping("/list/{categoryId}")
    public String getBlogList(@PathVariable int categoryId,
                              @RequestParam(defaultValue = "0", required = false) int page,
                              @RequestParam(defaultValue = "", required = false) String searchName,
                              Model model) {
        Pageable pageable = PageRequest.of(page, 3);
        Page<Blog> blogPage = blogService.findAll(pageable, searchName, categoryId);
        model.addAttribute("blogPage", blogPage);
        return "list-blog";
    }

    @GetMapping("/edit/{id}")
    public String getBlog(@PathVariable int id, Model model) {
        Blog blog = blogService.editBlog(id);
        model.addAttribute("blog", blog);
        return "edit-blog";
    }

    @PostMapping("/update")
    public String updateBlog(@ModelAttribute Blog blog, RedirectAttributes redirectAttributes) {
        int id = blog.getCategory().getId();
        blogService.updateBlog(blog);
        return "redirect:/blog/list/" + id;
    }

    @GetMapping("/detail/{id}")
    public String detailBlog(@PathVariable int id, Model model) {
        Blog blog = blogService.detailBlog(id);
        model.addAttribute("blog", blog);
        return "detail-blog";
    }

    @GetMapping("/delete/{id}")
    public String deleteBlog(@PathVariable int id, RedirectAttributes redirectAttributes) {
        Blog blog = blogService.deleteBlog(id);
        int idd = blog.getCategory().getId();
        return "redirect:/blog/list/" + idd;
    }
}
