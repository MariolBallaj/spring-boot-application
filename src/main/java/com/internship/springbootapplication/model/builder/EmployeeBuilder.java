package com.internship.springbootapplication.model.builder;

import com.internship.springbootapplication.model.entity.Employee;
import javafx.util.Builder;

public class EmployeeBuilder implements Builder<Employee> {

    private Employee employee = new Employee();

    public EmployeeBuilder withId(Integer id) {
        employee.setId(id);
        return this;
    }

    public EmployeeBuilder withFirstName(String firstName) {
        employee.setFirstName(firstName);
        return this;
    }

    public EmployeeBuilder withLastName(String lastName) {
        employee.setLastName(lastName);
        return this;
    }

    public EmployeeBuilder withMiddleName(String middleName) {
        employee.setMiddleName(middleName);
        return this;
    }

    @Override
    public Employee build() {
        return employee;
    }
}
