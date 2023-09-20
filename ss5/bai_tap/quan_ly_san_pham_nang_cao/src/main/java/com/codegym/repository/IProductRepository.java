package com.codegym.repository;

import com.codegym.model.Products;

import java.util.List;

public interface IProductRepository {
    List<Products> showList();

    List<Products> getProduct(int id);

    void addProduct(Products products);
}
