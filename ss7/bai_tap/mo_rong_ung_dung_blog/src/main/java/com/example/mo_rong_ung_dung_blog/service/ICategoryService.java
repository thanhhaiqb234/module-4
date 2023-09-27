package com.example.mo_rong_ung_dung_blog.service;

import com.example.mo_rong_ung_dung_blog.model.Category;

import java.util.List;

public interface ICategoryService {
    List<Category> showList();

    Category editCategory(int id);

    Category finAllById(int categoryId);

    void updateCategory(Category category);

    void deleteCategory(int id);
}
