package com.codegym.service;

import com.codegym.model.Products;

import java.util.List;

public interface IProductService {
    List<Products> showList();

    List<Products> getProduct(int id);

    void addProduct(Products products);
}
