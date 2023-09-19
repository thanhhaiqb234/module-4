package com.codegym.repository;

import com.codegym.model.Customer;
import com.codegym.repository.ICustomerRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class CustomerRepository implements ICustomerRepository {

    private static final List<Customer> customer ;
    static {
        customer = new ArrayList<>();
        customer.add(1, new Customer(1, "John", "john@codegym.vn", "Ha Noi"));
        customer.add(2, new Customer(2, "Bill", "bill@codegym.vn", "Hai Phong"));
        customer.add(3, new Customer(3, "Alex", "alex@codegym.vn", "Sai Gon"));
        customer.add(4, new Customer(4, "Adam", "adam@codegym.vn", "Beijing"));
        customer.add(5, new Customer(5, "Sophia", "sophia@codegym.vn", "Miami"));
        customer.add(6, new Customer(6, "Rose", "rose@codegym.vn", "NewYork"));
    }
    @Override
    public List<Customer> findAll() {
        return customer;
    }
}
