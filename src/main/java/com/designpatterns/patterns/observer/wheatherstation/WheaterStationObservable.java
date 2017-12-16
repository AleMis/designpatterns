package com.designpatterns.patterns.observer.wheatherstation;

import com.designpatterns.patterns.observer.forum.Observable;

public interface WheaterStationObservable {

    void addObserver(DisplayDeviceObserver observer);
    void notifyObserver();
    void removeObserver(DisplayDeviceObserver displayDeviceObserver);
    String getName();


}
