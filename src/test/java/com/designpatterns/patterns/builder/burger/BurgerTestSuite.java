package com.designpatterns.patterns.builder.burger;

import org.junit.Assert;
import org.junit.Test;

public class BurgerTestSuite {

    @Test
    public void testBurgerBuilder() {
        //Given
        //WHen
        Burger burger = new Burger.BurgerBuilder()
                .roll("Roll with sesame")
                .burgers(2)
                .ingredients("Salat")
                .ingredients("Onion")
                .ingredients("Becon")
                .ingredients("Chili pepper")
                .sauce("1000 islands sauce").build();
        System.out.println(burger);
        //When
        int howManyBurgers = burger.getBurgers();
        int howManyIngredients = burger.getIngredients().size();
        String whichRoll = burger.getRoll();
        String whichSauce = burger.getSauce();
        //Then
        Assert.assertEquals(2, howManyBurgers);
        Assert.assertEquals(4, howManyIngredients);
        Assert.assertEquals("Roll with sesame", whichRoll);
        Assert.assertEquals("1000 islands sauce", whichSauce);
    }

    @Test(expected = IllegalStateException.class)
    public void testBurgerIncorrectInputs() {
        //Given
        Burger burger = new Burger.BurgerBuilder()
                .roll("Roll without sesame")
                .sauce("Ketchup")
                .ingredients("Ruccolla")
                .build();
        //When
        int howManyIngredients = burger.getIngredients().size();
        String whichSauce = burger.getSauce();
        //Then
        Assert.assertEquals(0, howManyIngredients);
        Assert.assertNotEquals("Roll with sesame", burger.getRoll());
        Assert.assertNotEquals("1000 islands sauce", whichSauce);
    }
}
