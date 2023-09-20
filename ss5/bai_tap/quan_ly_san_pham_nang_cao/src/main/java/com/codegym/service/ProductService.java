package com.codegym.service;

import com.codegym.model.Products;
import com.codegym.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProductService{

    @Autowired
    private IProductRepository productRepository;
    @Override
    public List<Products> showList() {
        return productRepository.showList();
    }

    @Override
    public List<Products> getProduct(int id) {

        return productRepository.getProduct(id);
    }

    @Override
    public void addProduct(Products products) {
        productRepository.addProduct(products);
    }
}
