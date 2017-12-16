package com.designpatterns.patterns.adapter.company;

import com.designpatterns.patterns.adapter.company.newhrsystem.CompanySalaryProcessor;
import com.designpatterns.patterns.adapter.company.newhrsystem.Employee;
import com.designpatterns.patterns.adapter.company.oldhrsystem.SalaryCalculator;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SalaryAdapter extends SalaryAdaptee implements SalaryCalculator{

    @Override
    public double TotalSalary(String[][] workers, double[] salaries) {
        List<Employee> employeeList = new ArrayList<>();
        for(int i = 0; i<workers.length; i++) {
            Employee employee = new Employee(workers[i][0], workers[i][1], workers[i][2],  BigDecimal.valueOf(salaries[i]));
            employeeList.add(employee);
        }
        CompanySalaryProcessor companySalaryProcessor = new CompanySalaryProcessor();
        return companySalaryProcessor.calculateSalaries(employeeList).doubleValue();
    }
}
