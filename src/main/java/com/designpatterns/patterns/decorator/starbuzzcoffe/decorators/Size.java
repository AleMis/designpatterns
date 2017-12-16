package com.designpatterns.patterns.decorator.starbuzzcoffe.decorators;

import com.designpatterns.patterns.decorator.starbuzzcoffe.AbstractBeverageDecorator;
import com.designpatterns.patterns.decorator.starbuzzcoffe.Beverage;

import java.math.BigDecimal;

public class Size extends AbstractBeverageDecorator {
    private String size;

    public Size(Beverage beverage, String size) {
        super(beverage);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        if(size.equals("tall")) {
            this.size = "tall";
        }else if(size.equals("grande")) {
            this.size = "grande";
        }else if(size.equals("venti coffess")) {
            this.size = "venti coffess";
        }
    }

    @Override
    public BigDecimal getCost() {
        if(size.equals("tall")) {
           return super.getCost().add(new BigDecimal(0.1).setScale(2, BigDecimal.ROUND_HALF_UP));
        }else if(size.equals("grande")) {
           return super.getCost().add(new BigDecimal(0.15).setScale(2, BigDecimal.ROUND_HALF_UP));
        }else if(size.equals("venti coffess")) {
           return super.getCost().add(new BigDecimal(0.2).setScale(2, BigDecimal.ROUND_HALF_UP));
        }else {
            return super.getCost();
        }
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + " + size;
    }
}
