package net.javaguides.ems.backend.Mapper;

import net.javaguides.ems.backend.dto.EmployeeDto;
import net.javaguides.ems.backend.entity.Employee;

public class EmployeeMapper {

    public static Employee mapToEmployee(EmployeeDto dto) {
        return new Employee(
                dto.getId(),
                dto.getFirstName(),
                dto.getLastName(),
                dto.getEmail()
        );
    }

    public static EmployeeDto mapToEmployeeDto(Employee employee) {
        return new EmployeeDto(
                employee.getId(),
                employee.getFirstName(),
                employee.getLastName(),
                employee.getEmail()
        );
    }
}
