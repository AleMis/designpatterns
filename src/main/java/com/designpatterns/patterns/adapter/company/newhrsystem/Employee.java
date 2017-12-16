package com.designpatterns.patterns.adapter.company.newhrsystem;

import java.math.BigDecimal;

public class Employee {

    final private String peselId;
    final private String firstname;
    final private String lastname;
    final private BigDecimal baseSalary;

    public Employee(String peselId, String firstname, String lastname, BigDecimal baseSalary) {
        this.peselId = peselId;
        this.firstname = firstname;
        this.lastname = lastname;
        this.baseSalary = baseSalary;
    }

    public String getPeselId() {
        return peselId;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public BigDecimal getBaseSalary() {
        return baseSalary;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        Employee employee = (Employee) object;

        return peselId != null ? peselId.equals(employee.peselId) : employee.peselId == null;
    }

    @Override
    public int hashCode() {
        return peselId != null ? peselId.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "peselId='" + peselId + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", baseSalary=" + baseSalary +
                '}';
    }
}
