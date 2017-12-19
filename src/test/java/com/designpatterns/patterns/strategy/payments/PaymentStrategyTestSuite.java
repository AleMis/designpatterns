package com.designpatterns.patterns.strategy.payments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PaymentStrategyTestSuite {

    private ShoppingCart shoppingCart;

    @Before
    public void creteShoppingCart() {
        Item item = new Item("123", 15);
        Item item2 = new Item("321", 30);
        Item item3 = new Item("12456", 33);

        shoppingCart = new ShoppingCart();
        shoppingCart.addItem(item);
        shoppingCart.addItem(item2);
        shoppingCart.addItem(item3);
    }

    @Test
    public void testCreditCardStrategy() {
        //Given
        CreditCardStrategy cardStrategy = new CreditCardStrategy("XXX", "3123", "123123", "2018-12-12");

        //When
        //Then
        assertEquals("paid with credit/debit card", shoppingCart.pay(cardStrategy));
    }

    @Test
    public void testPaypalStrategy() {
        //Given
        PaypalStrategy paypalStrategy = new PaypalStrategy("user@gmail.com", "12345");

        //When
        //Then
        assertEquals("paid using Paypal", shoppingCart.pay(paypalStrategy));
    }
}
