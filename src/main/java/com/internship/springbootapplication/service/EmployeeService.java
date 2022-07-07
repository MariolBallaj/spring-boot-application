package com.internship.springbootapplication.service;

import com.internship.springbootapplication.model.dto.EmployeeDTO;
import com.internship.springbootapplication.model.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<EmployeeDTO> retrieveAllEmployees();

    List<Employee> retrieveEmployeesByFirstName(String firstName);

    Employee storeEmployee(Employee employee);

    Boolean deleteEmployee(Integer id);
}
