package com.example.products.repository;

import com.example.products.model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepository implements IProductRepository{

    private static final List<Product> productList = new ArrayList<>();
    //int id, String name, double price, String description, String supplier
    static {
        productList.add(new Product(1,"Hành Tây",15000,"Hàng mới về","CV"));
        productList.add(new Product(2,"Khoai Tây",20000,"Hàng mới về","CV"));
        productList.add(new Product(3,"Hành Lá",25000,"Hàng mới về","CV"));
        productList.add(new Product(4,"Hành Củ",30000,"Hàng mới về","CV"));
    }
    @Override
    public List<Product> showList() {
        return productList;
    }

    @Override
    public List<Product> productDetail(int id) {
        List<Product> products = new ArrayList<>();
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == id){
                products.add(productList.get(i));
                break;
            }
        }
        return products;
    }

    @Override
    public void productDelete(int id) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == id){
                productList.remove(i);
            }
        }
    }

    @Override
    public Product productEdit(int id) {
        Product product = new Product();
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == id){
                product.getId();
            }
        }
        return null;
    }
}
