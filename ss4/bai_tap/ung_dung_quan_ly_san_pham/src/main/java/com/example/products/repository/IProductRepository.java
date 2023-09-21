package com.example.products.repository;

import com.example.products.model.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> showList();

    List<Product> productDetail(int id);

    void productDelete(int id);

    Product productEdit(int id);
}
