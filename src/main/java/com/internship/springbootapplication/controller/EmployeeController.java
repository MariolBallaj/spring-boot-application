package com.internship.springbootapplication.controller;

import com.internship.springbootapplication.model.entity.Employee;
import com.internship.springbootapplication.service.EmployeeService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping
    public List<Employee> findAll() {
        return employeeService.retrieveAllEmployees();
    }

    @GetMapping("/{firstName}")
    public List<Employee> findByFirstName(@PathVariable("firstName") String firstName) {
        return employeeService.retrieveEmployeesByFirstName(firstName);
    }

    @PostMapping
    public Employee storeEmployee(@RequestBody Employee employee) {
        return employeeService.storeEmployee(employee);
    }

    @PutMapping
    public Employee updateEmployee(@RequestBody Employee employee) {
        return employeeService.storeEmployee(employee);
    }

    @DeleteMapping
    public Boolean deleteEmployee(@RequestParam(name = "id") Integer id) {
        return employeeService.deleteEmployee(id);
    }
}
