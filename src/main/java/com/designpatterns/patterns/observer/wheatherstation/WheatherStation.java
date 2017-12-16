package com.designpatterns.patterns.observer.wheatherstation;

import com.designpatterns.patterns.observer.wheatherstation.observable.Observable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class WheatherStation implements WheatherParametrObserver, WheaterStationObservable {

    private static final Logger LOG = LoggerFactory.getLogger(WheatherStation.class);

    private List<DisplayDeviceObserver> observers;
    private String name;
    private int updateCount;

    public WheatherStation(String name) {
        observers = new ArrayList<>();
        this.name = name;
    }

    @Override
    public void update(Observable observable) {
        LOG.info("Observable: " + observable.getName() + " updated! New value: "  + observable.getParameter());
        updateCount++;
    }

    public int getUpdateCount() {
        return updateCount;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void addObserver(DisplayDeviceObserver observer) {
        observers.add(observer);
        notifyObserver();
    }

    @Override
    public void notifyObserver() {
        for(DisplayDeviceObserver observer : observers) {
            observer.updateObserver(this);
        }
    }

    @Override
    public void removeObserver(DisplayDeviceObserver observer) {
        observers.remove(observer);
    }
}
