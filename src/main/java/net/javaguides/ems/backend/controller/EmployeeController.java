package net.javaguides.ems.backend.controller;

import lombok.AllArgsConstructor;
import net.javaguides.ems.backend.dto.EmployeeDto;
import net.javaguides.ems.backend.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController //class has become Spring MVC restcontroller and capable to handle http;s
@RequestMapping("/api/employees") //Used to declare the base api for all the methods
public class EmployeeController {

    private final EmployeeService employeeService;

    //build Add employee rest API
    @PostMapping
    public ResponseEntity<EmployeeDto> createEmployee(@RequestBody EmployeeDto employeeDto){
        EmployeeDto savedEmployee=employeeService.createeEmployee( employeeDto);
    return new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);
    }

    //Build Get employee rest API
    @GetMapping("{id}")
    public ResponseEntity<EmployeeDto> getEmployeeById(@PathVariable("id") Long employeeId){
        EmployeeDto employeeDto=employeeService.getEmployeeById(employeeId);
        return ResponseEntity.ok(employeeDto);
    }


}
