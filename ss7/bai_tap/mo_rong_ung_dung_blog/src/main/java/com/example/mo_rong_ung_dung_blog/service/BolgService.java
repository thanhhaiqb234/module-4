package com.example.mo_rong_ung_dung_blog.service;


import com.example.mo_rong_ung_dung_blog.model.Blog;
import com.example.mo_rong_ung_dung_blog.repository.IBlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BolgService implements IBlogService{
    @Autowired
    private IBlogRepository blogRepository;

    @Override
    public List<Blog> findAll(int categoryId) {
        return blogRepository.findAll(categoryId);
    }
}
