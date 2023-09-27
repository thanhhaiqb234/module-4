package com.example.mo_rong_ung_dung_blog.service;

import com.example.mo_rong_ung_dung_blog.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IBlogService {

    Blog editBlog(int id);

    void updateBlog(Blog blog);

    Blog detailBlog(int id);

    Blog deleteBlog(int id);

    Page<Blog> findAll(Pageable pageable, String seachName, int categoryId);

    Blog getBlog(int categoryId);
}
