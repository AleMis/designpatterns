package com.designpatterns.patterns.decorator.starbuzzcoffe;

import com.designpatterns.patterns.decorator.starbuzzcoffe.Beverage;

import java.math.BigDecimal;

public class Decaf implements Beverage {

    @Override
    public BigDecimal getCost() {
        return new BigDecimal(4);
    }

    @Override
    public String getDescription() {
        return "Decaf";
    }
}
