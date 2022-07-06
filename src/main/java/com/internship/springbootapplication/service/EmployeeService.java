package com.internship.springbootapplication.service;

import com.internship.springbootapplication.model.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> retrieveAllEmployees();

    List<Employee> retrieveEmployeesByFirstName(String firstName);

    Employee storeEmployee(Employee employee);

    Boolean deleteEmployee(Integer id);
}
