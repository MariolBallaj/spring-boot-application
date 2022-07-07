package com.internship.springbootapplication.model.builder;

import com.internship.springbootapplication.model.dto.EmployeeDTO;
import javafx.util.Builder;

public class EmployeeDTOBuilder implements Builder<EmployeeDTO> {

    private EmployeeDTO employeeDTO = new EmployeeDTO();

    public EmployeeDTOBuilder withId(Integer id) {
        employeeDTO.setId(id);
        return this;
    }

    public EmployeeDTOBuilder withFirstName(String firstName) {
        employeeDTO.setFirstName(firstName);
        return this;
    }

    public EmployeeDTOBuilder withLastName(String lastName) {
        employeeDTO.setLastName(lastName);
        return this;
    }

    public EmployeeDTOBuilder withMiddleName(String middleName) {
        employeeDTO.setMiddleName(middleName);
        return this;
    }

    @Override
    public EmployeeDTO build() {
        return employeeDTO;
    }
}
