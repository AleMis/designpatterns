package com.designpatterns.patterns.decorator.starbuzzcoffe.concretecomponents;

import com.designpatterns.patterns.decorator.starbuzzcoffe.Beverage;

import java.math.BigDecimal;

public class HouseBlend implements Beverage {



    @Override
    public BigDecimal getCost() {
        return new BigDecimal(4);
    }

    @Override
    public String getDescription() {
        return "House Blend";
    }
}
