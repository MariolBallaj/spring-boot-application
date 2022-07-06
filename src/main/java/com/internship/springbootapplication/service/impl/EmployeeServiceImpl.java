package com.internship.springbootapplication.service.impl;

import com.internship.springbootapplication.model.entity.Employee;
import com.internship.springbootapplication.repository.EmployeeRepository;
import com.internship.springbootapplication.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(final EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> retrieveAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public List<Employee> retrieveEmployeesByFirstName(String firstName) {
        return employeeRepository.findByFirstName(firstName);
    }

    @Override
    public Employee storeEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Boolean deleteEmployee(Integer id) {
        employeeRepository.deleteById(id);
        return true;
    }
}
