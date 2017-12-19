package com.designpatterns.patterns.strategy.stockbroker;

public class IndividualYoungCustomer extends Customer {

    public IndividualYoungCustomer(String name) {
        super(name);
        this.buyPredictor = new AgressivePredictor();
    }
}