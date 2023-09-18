package com.codegym.service;

import com.codegym.model.Employee;

import java.util.List;

public interface IEmployeeService {
    List<Employee> showListEmployee();

    void addEmployee(Employee employee);
}
