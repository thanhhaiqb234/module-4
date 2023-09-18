package com.codegym.controller;

import com.codegym.model.Employee;
import com.codegym.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private IEmployeeService employeeService;
    @GetMapping("/showform")
    public ModelAndView showEmployee(){
       List<Employee> employeeList = employeeService.showListEmployee();
       ModelAndView modelAndView = new ModelAndView("index","employeeList",employeeList);
        return modelAndView;
    }

    @GetMapping("/employee/create")
    public String createEmployee(Model model){
        model.addAttribute("employee",new Employee());
        return "create";
    }

    @PostMapping("/create")
    public String createEmployee(@ModelAttribute Employee employee,
                                 Model model){
        employeeService.addEmployee(employee);
        List<Employee> employeeList = employeeService.showListEmployee();
        model.addAttribute("employeeList" , employeeList);
        return "index";
    }
}
