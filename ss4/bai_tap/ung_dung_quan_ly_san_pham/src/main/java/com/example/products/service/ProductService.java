package com.example.products.service;

import com.example.products.model.Product;
import com.example.products.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProductService{

    @Autowired
    private IProductRepository productRepository;
    @Override
    public List<Product> showList() {
        return productRepository.showList();
    }

    @Override
    public List<Product> productDetail(int id) {
        return productRepository.productDetail(id);
    }

    @Override
    public void productDelete(int id) {
        productRepository.productDelete(id);
    }

    @Override
    public Product productEdit(int id) {
        return productRepository.productEdit(id);
    }
}
