package com.designpatterns.patterns.observer.wheatherstation;

import com.designpatterns.patterns.observer.wheatherstation.observable.Observable;

public interface WheatherParametrObserver {

    void update(Observable observable);
}
