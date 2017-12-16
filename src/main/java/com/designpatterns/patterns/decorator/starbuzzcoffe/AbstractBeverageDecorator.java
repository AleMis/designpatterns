package com.designpatterns.patterns.decorator.starbuzzcoffe;


import java.math.BigDecimal;

public abstract class AbstractBeverageDecorator implements Beverage {

    private Beverage beverage;
    private String size;

    public AbstractBeverageDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public BigDecimal getCost() {
        return beverage.getCost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription();
    }

}
