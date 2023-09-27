package com.example.mo_rong_ung_dung_blog.service;

import com.example.mo_rong_ung_dung_blog.model.Blog;

import java.util.List;

public interface IBlogService {
List<Blog> findAll(int categoryId);

    Blog editBlog(int id);

    void updateBlog(Blog blog);

    Blog detailBlog(int id);

    Blog deleteBlog(int id);
}
