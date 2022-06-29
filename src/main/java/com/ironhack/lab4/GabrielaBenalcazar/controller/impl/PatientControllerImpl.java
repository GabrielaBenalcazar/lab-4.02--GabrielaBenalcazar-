package com.ironhack.lab4.GabrielaBenalcazar.controller.impl;

import com.ironhack.lab4.GabrielaBenalcazar.controller.interfaces.PatientController;
import com.ironhack.lab4.GabrielaBenalcazar.model.Patient;
import com.ironhack.lab4.GabrielaBenalcazar.repository.EmployeeRepository;
import com.ironhack.lab4.GabrielaBenalcazar.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class PatientControllerImpl implements PatientController {
    @Autowired
    private PatientRepository patientRepository;

    @GetMapping("/all-patients")
    public List<Patient> findAll() {
        return patientRepository.findAll();
    }

    @GetMapping("/patient/by-id/{Id}")
    public Patient findById(@PathVariable Long Id) {
        Optional<Patient> optionalPatient = patientRepository.findById(Id);

        return optionalPatient.get();
    }

    @GetMapping("/patient/by-birth-date/{date_of_birth}")
    public List<Patient> findByDateOfBirth(@PathVariable  String date_of_birth) {
        return patientRepository.findByDateOfBirth(date_of_birth);
    }

    @GetMapping("/patient/by-doctor-by.department/{department}")
    public List<Patient> findByAdmittedByDepartment( @PathVariable  String department) {
        return patientRepository.findByAdmittedByDepartment(department);
    }

    @GetMapping("/patient/by-doctor-status-off")
    public List<Patient> findByAdmittedByStatusOff() {
        return patientRepository.findByAdmittedByStatusOff();
    }
}
