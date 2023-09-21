package com.example.ung_dung_blog_ca_nhan.repository;


import com.example.ung_dung_blog_ca_nhan.model.Products;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IProductRepository extends JpaRepository<Products,Integer> {
}
