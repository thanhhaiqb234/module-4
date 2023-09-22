package com.example.products.service;

import com.example.products.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> showList();

    Product  productDetail(int id);

    void productDelete(int id);

    Product productEdit(int id);

    void updateProduct(int id,Product product);
}
