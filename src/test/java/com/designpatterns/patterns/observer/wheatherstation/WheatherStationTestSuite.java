package com.designpatterns.patterns.observer.wheatherstation;

import com.designpatterns.patterns.observer.wheatherstation.observable.HumiditySensorDevice;
import com.designpatterns.patterns.observer.wheatherstation.observable.PressureSensorDevice;
import com.designpatterns.patterns.observer.wheatherstation.observable.TemperatureSensoreDevice;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WheatherStationTestSuite {

    @Test
    public void testWheatherStationUpdate() {
        //Given
        HumiditySensorDevice humiditySensorDevice = new HumiditySensorDevice("Humidity");
        humiditySensorDevice.setParameter(30);
        PressureSensorDevice pressureSensorDevice = new PressureSensorDevice("Pressure");
        pressureSensorDevice.setParameter(1000);
        TemperatureSensoreDevice temperatureSensoreDevice = new TemperatureSensoreDevice("Temperature");
        temperatureSensoreDevice.setParameter(25);

        WheatherStation wheatherStation = new WheatherStation("Wheather station");

        humiditySensorDevice.addObserver(wheatherStation);
        pressureSensorDevice.addObserver(wheatherStation);
        temperatureSensoreDevice.addObserver(wheatherStation);

        //When
        Double pressuer = pressureSensorDevice.getParameter();
        Double humidity = humiditySensorDevice.getParameter();
        Double temperature = temperatureSensoreDevice.getParameter();

        Double expectedPressuer = 1000.0;
        Double expectedHumidity = 30.0;
        Double expectedTemperatur = 25.0;

        int updateCount = wheatherStation.getUpdateCount();

        //Then
        assertEquals(expectedPressuer,  pressuer);
        assertEquals(expectedHumidity, humidity);
        assertEquals(expectedTemperatur, temperature);
        assertEquals(3, updateCount);
    }

    @Test
    public void testDisplayDeviceUpdate() {
        //Given
        HumiditySensorDevice humiditySensorDevice = new HumiditySensorDevice("Humidity");
        humiditySensorDevice.setParameter(30);
        PressureSensorDevice pressureSensorDevice = new PressureSensorDevice("Pressure");
        pressureSensorDevice.setParameter(1000);
        TemperatureSensoreDevice temperatureSensoreDevice = new TemperatureSensoreDevice("Temperature");
        temperatureSensoreDevice.setParameter(25);

        WheatherStation wheatherStation = new WheatherStation("Wheather station");

        humiditySensorDevice.addObserver(wheatherStation);
        pressureSensorDevice.addObserver(wheatherStation);
        temperatureSensoreDevice.addObserver(wheatherStation);

        DisplayDevice displayDevice = new DisplayDevice("Display Device");
        wheatherStation.addObserver(displayDevice);


        //When
        int updateCount = displayDevice.getUpdateCount();

        //Then
        assertEquals(1, updateCount);
    }
}
