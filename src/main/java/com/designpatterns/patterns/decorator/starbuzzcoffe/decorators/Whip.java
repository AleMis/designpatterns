package com.designpatterns.patterns.decorator.starbuzzcoffe.decorators;

import com.designpatterns.patterns.decorator.starbuzzcoffe.AbstractBeverageDecorator;
import com.designpatterns.patterns.decorator.starbuzzcoffe.Beverage;

import java.math.BigDecimal;

public class Whip extends AbstractBeverageDecorator {

    public Whip(Beverage beverage) {
        super(beverage);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(3));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + whip";
    }
}
