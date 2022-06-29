package com.ironhack.lab4.GabrielaBenalcazar.controller.interfaces;

import com.ironhack.lab4.GabrielaBenalcazar.model.Patient;

import java.util.List;

public interface PatientController {
    List<Patient> findAll();
    Patient findById(Long Id);
    List<Patient> findByDateOfBirth(String dateOfBirth);
    List<Patient> findByAdmittedByDepartment(String department);
    List<Patient> findByAdmittedByStatusOff();
}
