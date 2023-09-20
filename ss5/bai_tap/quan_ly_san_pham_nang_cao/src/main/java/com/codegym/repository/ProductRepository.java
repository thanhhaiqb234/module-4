package com.codegym.repository;

import com.codegym.model.Products;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class ProductRepository implements IProductRepository{

    @PersistenceContext
    private EntityManager entityManager;
    @Override
    public List<Products> showList() {
        TypedQuery<Products> query = entityManager.createQuery("from Products", Products.class);
        return query.getResultList();
    }

    @Override
    public List<Products> getProduct(int id) {
        return null;
    }

    @Override
    public void addProduct(Products products) {
        entityManager.persist(products);
    }
}
