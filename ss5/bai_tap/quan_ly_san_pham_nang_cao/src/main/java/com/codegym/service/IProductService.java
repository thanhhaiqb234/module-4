package com.codegym.service;

import com.codegym.model.Products;

import java.util.List;

public interface IProductService {
    List<Products> showList();

    void addProduct(Products products);

    Products getProduct(int id);

    void delete(int id);
}
