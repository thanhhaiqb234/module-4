package com.codegym.repository;

import com.codegym.model.Customer;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class CustomerRepository implements ICustomerRepository{
    private static List<Customer> customerList = new ArrayList<>();

    static {
        customerList.add(new Customer(1,"Đinh Thanh Hải","thanhhaiqb234@gmail.com","Quảng Bình"));
        customerList.add(new Customer(2,"Phạm Công Nam","thanhhaiqb234@gmail.com","Nghệ An"));
        customerList.add(new Customer(3,"Đinh Tuẩn Kiệt","thanhhaiqb234@gmail.com","Gia Lai"));
        customerList.add(new Customer(4,"Phạm Quang Hưng","thanhhaiqb234@gmail.com","Đà Nẵng"));
        customerList.add(new Customer(5,"Trương Thị Yến Hoa","thanhhaiqb234@gmail.com","Đà Nẵng"));
    }
    @Override
    public List<Customer> showList() {
        return customerList;
    }
}
