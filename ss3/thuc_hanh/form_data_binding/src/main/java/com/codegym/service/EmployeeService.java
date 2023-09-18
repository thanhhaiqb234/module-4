package com.codegym.service;

import com.codegym.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService implements IEmployeeService{

    private static List<Employee> employeeList = new ArrayList<>();
    static {
        employeeList.add(new Employee("1","Dinh Thanh Hai","0123456789"));
        employeeList.add(new Employee("2","Pham Cong Nam","0123456789"));
        employeeList.add(new Employee("3","Pham Quang Hung","0123456789"));
        employeeList.add(new Employee("4","Dinh Tuan Kiet","0123456789"));
        employeeList.add(new Employee("5","Le Phuoc Tai","0123456789"));
    }

    @Override
    public List<Employee> showListEmployee() {
        return employeeList;
    }

    @Override
    public void addEmployee(Employee employee) {
        employeeList.add(employee);
        employeeList.size();
    }
}
