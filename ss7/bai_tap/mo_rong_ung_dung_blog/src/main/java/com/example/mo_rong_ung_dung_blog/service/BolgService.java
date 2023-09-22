package com.example.mo_rong_ung_dung_blog.service;

import com.example.mo_rong_ung_dung_blog.model.Blog;
import com.example.mo_rong_ung_dung_blog.repository.IBolgRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.PersistenceContext;
import java.util.List;

@Service
public class BolgService implements IBlogService{

    @Autowired
    private IBolgRepository bolgRepository;
    @Override
    public List<Blog> showList() {
        return bolgRepository.findAll();
    }
}
