package net.javaguides.ems.backend.service;

import net.javaguides.ems.backend.dto.EmployeeDto;

public interface EmployeeService {
    EmployeeDto createeEmployee(EmployeeDto employeeDto);
    EmployeeDto getEmployeeById(Long employeeId);

}
