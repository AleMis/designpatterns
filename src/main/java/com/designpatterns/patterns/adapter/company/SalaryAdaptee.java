package com.designpatterns.patterns.adapter.company;

import com.designpatterns.patterns.adapter.company.newhrsystem.CompanySalaryProcessor;
import com.designpatterns.patterns.adapter.company.newhrsystem.Employee;
import com.designpatterns.patterns.adapter.company.newhrsystem.SalaryProcessor;

import java.math.BigDecimal;
import java.util.List;

public class SalaryAdaptee implements SalaryProcessor {

    @Override
    public BigDecimal calculateSalaries(List<Employee> employees) {
        CompanySalaryProcessor salaryProcessor = new CompanySalaryProcessor();
        return salaryProcessor.calculateSalaries(employees);
    }
}
