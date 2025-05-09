package net.javaguides.ems.backend.service.impl;

import lombok.AllArgsConstructor;
import net.javaguides.ems.backend.Mapper.EmployeeMapper;
import net.javaguides.ems.backend.dto.EmployeeDto;
import net.javaguides.ems.backend.entity.Employee;
import net.javaguides.ems.backend.exceptions.ResourceNotFoundException;
import net.javaguides.ems.backend.repository.EmployeeRepository;
import net.javaguides.ems.backend.repository.EmployeeRepository;
import net.javaguides.ems.backend.service.EmployeeService;
import org.springframework.stereotype.Service;

@Service //it tells Spring to crate a bean of the Particular class i.e EmployeeServiceImpl
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService{

    private EmployeeRepository employeeRepository;
    @Override
    public EmployeeDto createeEmployee(EmployeeDto employeeDto) {

        Employee employee= EmployeeMapper.mapToEmployee(employeeDto);
        Employee saveEmployee = employeeRepository.save(employee);

        return EmployeeMapper.mapToEmployeeDto(saveEmployee);
    }

    @Override
    public EmployeeDto getEmployeeById(Long employeeId) {
        Employee employee= employeeRepository.findById(employeeId)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Employee does not exists with the given id: "+ employeeId) );
        return EmployeeMapper.mapToEmployeeDto(employee);
    }
}
