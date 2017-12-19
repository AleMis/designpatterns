package com.designpatterns.patterns.strategy.stockbroker;

public class AgressivePredictor implements BuyPredictor{

    @Override
    public String predictWhatToBuy() {
        return "[Aggressive predictor] Buy stock of XYZ";
    }
}
