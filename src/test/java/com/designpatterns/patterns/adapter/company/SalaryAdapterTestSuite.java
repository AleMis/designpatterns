package com.designpatterns.patterns.adapter.company;

import com.designpatterns.patterns.adapter.company.oldhrsystem.Workers;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SalaryAdapterTestSuite {

    @Test
    public void testSalaryCalculator() {
        //Given
        Workers workers = new Workers();
        SalaryAdapter salaryAdapter = new SalaryAdapter();

        //When
        double totalSalary = salaryAdapter.TotalSalary(workers.getWorkers(), workers.getSalaries());

        //Then
        assertEquals(27750, totalSalary, 0);
    }
}
