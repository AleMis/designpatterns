package com.designpatterns.patterns.observer.wheatherstation.observable;

import com.designpatterns.patterns.observer.wheatherstation.WheatherParametrObserver;

import java.util.ArrayList;
import java.util.List;

public class PressureSensorDevice implements Observable {

    private List<WheatherParametrObserver> observers;
    private String name;
    private double parameter;


    public PressureSensorDevice(String name) {
        observers = new ArrayList<>();
        this.name = name;
    }

    @Override
    public void addObserver(WheatherParametrObserver observer) {
        observers.add(observer);
        updateObserver();
    }

    @Override
    public void updateObserver() {
        for(WheatherParametrObserver observer : observers) {
            observer.update(this);
        }
    }

    @Override
    public void removeObserver(WheatherParametrObserver observer) {
        observers.remove(observer);
    }

    @Override
    public double getParameter() {
        return parameter;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setParameter(double parameter) {
        this.parameter = parameter;
    }
}
