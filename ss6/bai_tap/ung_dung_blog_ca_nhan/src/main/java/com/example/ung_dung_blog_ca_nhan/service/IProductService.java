package com.example.ung_dung_blog_ca_nhan.service;


import com.example.ung_dung_blog_ca_nhan.model.Products;

import java.util.List;

public interface IProductService {
    List<Products> showList();

    void addProduct(Products products);

    Products getProduct(int id);

    void delete(int id);

    Products editProduct(int id);

    void updateProduct(Products products);
}
