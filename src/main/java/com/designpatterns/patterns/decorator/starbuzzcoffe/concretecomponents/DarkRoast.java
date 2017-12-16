package com.designpatterns.patterns.decorator.starbuzzcoffe.concretecomponents;

import com.designpatterns.patterns.decorator.starbuzzcoffe.Beverage;

import java.math.BigDecimal;

public class DarkRoast implements Beverage {

    private String size;

    @Override
    public BigDecimal getCost() {
        return new BigDecimal(3);
    }

    @Override
    public String getDescription() {
        return "Dark Roast";
    }

}
