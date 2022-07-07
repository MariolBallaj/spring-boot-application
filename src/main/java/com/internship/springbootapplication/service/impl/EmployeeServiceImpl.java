package com.internship.springbootapplication.service.impl;

import com.internship.springbootapplication.converter.AbstractConverter;
import com.internship.springbootapplication.converter.EmployeeConverter;
import com.internship.springbootapplication.model.dto.EmployeeDTO;
import com.internship.springbootapplication.model.entity.Employee;
import com.internship.springbootapplication.repository.EmployeeRepository;
import com.internship.springbootapplication.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final AbstractConverter<Employee, EmployeeDTO> employeeConverter;

    public EmployeeServiceImpl(final EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
        this.employeeConverter = new EmployeeConverter();
    }

    @Override
    public List<EmployeeDTO> retrieveAllEmployees() {
        return employeeRepository.findAll().stream().map(employeeConverter::toDto).collect(Collectors.toList());
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
