package com.designpatterns.patterns.decorator.starbuzzcoffe;

import com.designpatterns.patterns.decorator.starbuzzcoffe.Beverage;

import java.math.BigDecimal;

public class DarkRoast implements Beverage {

    @Override
    public BigDecimal getCost() {
        return new BigDecimal(3);
    }

    @Override
    public String getDescription() {
        return "Dark Roast";
    }
}
