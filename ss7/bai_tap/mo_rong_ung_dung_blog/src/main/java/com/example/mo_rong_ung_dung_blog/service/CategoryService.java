package com.example.mo_rong_ung_dung_blog.service;

import com.example.mo_rong_ung_dung_blog.model.Blog;
import com.example.mo_rong_ung_dung_blog.model.Category;
import com.example.mo_rong_ung_dung_blog.repository.ICategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService implements ICategoryService{

    @Autowired
    private ICategoryRepository categoryRepository;

    @Override
    public Category editCategory(int id) {
        return categoryRepository.findById(id).get();
    }

    @Override
    public Category finAllById(int categoryId) {
        return categoryRepository.findById(categoryId).get();
    }

    @Override
    public void updateCategory(Category category) {
        categoryRepository.save(category);
    }

    @Override
    public void deleteCategory(int id) {
        Category category = categoryRepository.findById(id).get();
        categoryRepository.delete(category);
    }

    @Override
    public Page<Category> showList(Pageable pageable, String seachName) {
        return categoryRepository.findAllByNameContaining(pageable,seachName);
    }
}
