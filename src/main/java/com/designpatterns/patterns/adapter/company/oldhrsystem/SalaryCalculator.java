package com.designpatterns.patterns.adapter.company.oldhrsystem;

public interface SalaryCalculator {
    double TotalSalary(String[][] workers, double[] salaries);
}