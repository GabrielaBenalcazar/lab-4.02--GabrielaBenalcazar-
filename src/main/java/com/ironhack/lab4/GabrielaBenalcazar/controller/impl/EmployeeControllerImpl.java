package com.ironhack.lab4.GabrielaBenalcazar.controller.impl;

import com.ironhack.lab4.GabrielaBenalcazar.controller.interfaces.EmployeeController;
import com.ironhack.lab4.GabrielaBenalcazar.enums.Status;
import com.ironhack.lab4.GabrielaBenalcazar.model.Employee;
import com.ironhack.lab4.GabrielaBenalcazar.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeControllerImpl implements EmployeeController {
@Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping("/all-doctors")
    @ResponseStatus(HttpStatus.OK)
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @GetMapping("/doctor/by-id/{Id}")
    @ResponseStatus(HttpStatus.OK)
    public Employee findById(@PathVariable Long Id) {
        Optional<Employee> optionalEmployee = employeeRepository.findById(Id);
        return optionalEmployee.get();
    }

    @GetMapping("/doctor/by-status/{status}")
    @ResponseStatus(HttpStatus.OK)
    public List<Employee> findByStatus(@PathVariable Status status) {
        return employeeRepository.findByStatus(status);
    }

    @GetMapping("/doctor/by-department/{department}")
    @ResponseStatus(HttpStatus.OK)
    public List<Employee> findByDepartment(@PathVariable String department) {
        return employeeRepository.findByDepartment(department);
    }

}
