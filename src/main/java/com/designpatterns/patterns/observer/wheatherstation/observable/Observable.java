package com.designpatterns.patterns.observer.wheatherstation.observable;

import com.designpatterns.patterns.observer.wheatherstation.WheatherParametrObserver;

public interface Observable {

    void addObserver(WheatherParametrObserver observer);
    void updateObserver();
    void removeObserver(WheatherParametrObserver observer);
    double getParameter();
    String getName();
}
