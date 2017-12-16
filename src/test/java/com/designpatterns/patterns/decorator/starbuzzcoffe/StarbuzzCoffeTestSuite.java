package com.designpatterns.patterns.decorator.starbuzzcoffe;

import com.designpatterns.patterns.decorator.starbuzzcoffe.concretecomponents.DarkRoast;
import com.designpatterns.patterns.decorator.starbuzzcoffe.decorators.Milk;
import com.designpatterns.patterns.decorator.starbuzzcoffe.decorators.Mocha;
import com.designpatterns.patterns.decorator.starbuzzcoffe.decorators.Size;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class StarbuzzCoffeTestSuite {

    @Test
    public void testStarbuzzCoffeGetCost() {
        //Given
        Beverage beverage = new DarkRoast();
        beverage = new Milk(beverage);
        beverage = new Mocha(beverage);

        //When
        BigDecimal cost = beverage.getCost();

        //Then
        assertEquals(new BigDecimal(8), cost);
    }

    @Test
    public void testStarbuzzCoffeGetDescription() {
        //Given
        Beverage beverage = new DarkRoast();
        beverage = new Milk(beverage);
        beverage = new Mocha(beverage);

        //When
        String description = beverage.getDescription();

        //Then
        assertEquals("Dark Roast + milk + mocha", description);
    }

    @Test
    public void testStarbuzzCoffeSetSize() {
        //Given
        Beverage beverage = new DarkRoast();
        beverage = new Milk(beverage);
        beverage = new Mocha(beverage);
        beverage = new Size(beverage, "grande");

        //When
        BigDecimal cost = beverage.getCost();
        String description = beverage.getDescription();

        //Then
        assertEquals("Dark Roast + milk + mocha + grande", description);
        assertEquals(new BigDecimal(8.15).setScale(2, BigDecimal.ROUND_HALF_UP), cost);
    }
}
