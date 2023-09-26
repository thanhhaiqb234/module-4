package com.example.mo_rong_ung_dung_blog.service;

import com.example.mo_rong_ung_dung_blog.model.Category;
import com.example.mo_rong_ung_dung_blog.repository.ICategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CategoryService implements ICategoryService{

    @Autowired
    private ICategoryRepository categoryRepository;
    @Override
    public List<Category> showList() {
        return categoryRepository.findAll();
    }

    @Override
    public Category editCategory(int id) {
        return categoryRepository.findById(id).get();
    }

    @Override
    public Category finAllById(int categoryId) {
        return categoryRepository.findById(categoryId).get();
    }
}
