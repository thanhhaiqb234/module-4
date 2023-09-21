package com.codegym.repository;

import com.codegym.model.Products;

import java.util.List;

public interface IProductRepository {
    List<Products> showList();

    void addProduct(Products products);

    Products getProduct(int id);

    void delete(int id);

    Products eidtProduct(int id);

    void updateProduct(int id, Products products);
}
