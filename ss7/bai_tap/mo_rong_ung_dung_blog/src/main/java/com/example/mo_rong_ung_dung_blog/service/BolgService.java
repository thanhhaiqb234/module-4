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

    @Override
    public Blog editBlog(int id) {
        return blogRepository.findById(id).get();
    }

    @Override
    public void updateBlog(Blog blog) {
        blogRepository.save(blog);
    }

    @Override
    public Blog detailBlog(int id) {
        return blogRepository.findById(id).get();
    }

    @Override
    public Blog deleteBlog(int id) {
       Blog blog = blogRepository.findById(id).get();
       blogRepository.delete(blog);
       return blog;
    }
}
