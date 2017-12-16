package com.designpatterns.patterns.observer.wheatherstation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DisplayDevice implements DisplayDeviceObserver{

    private static final Logger LOG = LoggerFactory.getLogger(WheatherStation.class);

    private String name;
    private int updateCount;

    public DisplayDevice(String name) {
        this.name = name;
    }

    @Override
    public void updateObserver(WheaterStationObservable observable) {
        LOG.info("Station: " + observable.getName() + " updated!");
        updateCount++;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
