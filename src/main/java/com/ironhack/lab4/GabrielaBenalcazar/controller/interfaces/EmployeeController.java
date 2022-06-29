package com.ironhack.lab4.GabrielaBenalcazar.controller.interfaces;

import com.ironhack.lab4.GabrielaBenalcazar.enums.Status;
import com.ironhack.lab4.GabrielaBenalcazar.model.Employee;

import java.util.List;

public interface EmployeeController {
    List<Employee> findAll();
    Employee findById(Long Id);
    List<Employee> findByStatus(Status status);
    List<Employee> findByDepartment(String department);
}
