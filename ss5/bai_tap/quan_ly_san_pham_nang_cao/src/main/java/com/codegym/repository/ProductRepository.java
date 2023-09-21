package com.codegym.repository;

import com.codegym.model.Products;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
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
    @Transactional
    @Override
    public void addProduct(Products products) {
        entityManager.persist(products);
    }

    @Override
    public Products getProduct(int id) {
        return entityManager.find(Products.class,id);
    }


    @Transactional
    @Override
    public void delete(int id) {
        Products product = getProduct(id);
        entityManager.remove(product);
    }

    @Override
    public Products eidtProduct(int id) {
        return entityManager.find(Products.class,id);
    }

    @Transactional
    @Override
    public void updateProduct(int id, Products products) {
        Products product = getProduct(id);
        product.setName(products.getName());
        product.setPrice(products.getPrice());
        product.setDescription(products.getDescription());
        product.setSupplier(products.getSupplier());
        entityManager.merge(product);
    }
}
