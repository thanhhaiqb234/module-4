package com.codegym.repository;

import com.codegym.model.Products;

import java.util.List;

public interface IProductRepository {
    List<Products> showList();
}
