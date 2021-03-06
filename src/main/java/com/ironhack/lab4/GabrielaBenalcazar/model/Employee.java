package com.ironhack.lab4.GabrielaBenalcazar.model;

import com.ironhack.lab4.GabrielaBenalcazar.enums.Status;

import javax.persistence.*;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String department;
    private String name;

    @Enumerated(EnumType.STRING)
    private Status status;

    public Employee() {
    }

    public Employee(String department, String name, Status status) {
        this.department = department;
        this.name = name;
        this.status = status;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
