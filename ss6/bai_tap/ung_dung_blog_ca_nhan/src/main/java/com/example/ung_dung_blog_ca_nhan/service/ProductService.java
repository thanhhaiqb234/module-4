package com.example.ung_dung_blog_ca_nhan.service;


import com.example.ung_dung_blog_ca_nhan.model.Products;
import com.example.ung_dung_blog_ca_nhan.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProductService{
    @Autowired
    private IProductRepository productRepository;
    @Override
    public List<Products> showList() {
        return productRepository.findAll();
    }

    @Override
    public void addProduct(Products products) {
        Products products1 = productRepository.save(products);
    }

    @Override
    public Products getProduct(int id) {
        return productRepository.findById(id).get();
    }

    @Override
    public void delete(int id) {
        Products products = productRepository.findById(id).get();
        productRepository.delete(products);
    }

    @Override
    public Products editProduct(int id) {
        return productRepository.findById(id).get();
    }

    @Override
    public void updateProduct(Products products) {
        productRepository.save(products);
    }
}
