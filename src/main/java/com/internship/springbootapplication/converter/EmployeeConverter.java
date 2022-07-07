package com.internship.springbootapplication.converter;

import com.internship.springbootapplication.model.builder.EmployeeBuilder;
import com.internship.springbootapplication.model.builder.EmployeeDTOBuilder;
import com.internship.springbootapplication.model.dto.EmployeeDTO;
import com.internship.springbootapplication.model.entity.Employee;

public class EmployeeConverter extends AbstractConverter<Employee, EmployeeDTO> {

    @Override
    public Employee toEntity(EmployeeDTO employeeDTO) {
        return new EmployeeBuilder()
                .withId(employeeDTO.getId())
                .withFirstName(employeeDTO.getFirstName())
                .withLastName(employeeDTO.getLastName())
                .withMiddleName(employeeDTO.getMiddleName())
                .build();
    }

    @Override
    public EmployeeDTO toDto(Employee employee) {
        return new EmployeeDTOBuilder()
                .withId(employee.getId())
                .withFirstName(employee.getFirstName())
                .withLastName(employee.getLastName())
                .withMiddleName(employee.getMiddleName())
                .build();
    }

}
