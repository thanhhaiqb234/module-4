package com.codegym.service;

import com.codegym.model.Customer;
import com.codegym.repository.CustomerRepository;
import com.codegym.repository.ICustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService implements ICustomerService {

    private final ICustomerRepository customerRepository = new CustomerRepository();
    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }
}
