package com.example.mo_rong_ung_dung_blog.service;

import com.example.mo_rong_ung_dung_blog.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ICategoryService {

    Category editCategory(int id);

    Category finAllById(int categoryId);

    void updateCategory(Category category);

    void deleteCategory(int id);

    Page<Category> showList(Pageable pageable, String seachName);
}
