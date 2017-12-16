package com.designpatterns.patterns.decorator.starbuzzcoffe.concretecomponents;

import com.designpatterns.patterns.decorator.starbuzzcoffe.Beverage;

import java.math.BigDecimal;

public class Espresson implements Beverage {

    @Override
    public BigDecimal getCost() {
        return new BigDecimal(5);
    }

    @Override
    public String getDescription() {
        return "Espresso";
    }
}
