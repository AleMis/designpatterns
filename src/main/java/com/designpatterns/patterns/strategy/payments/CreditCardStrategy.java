package com.designpatterns.patterns.strategy.payments;

public class CreditCardStrategy implements PaymentsStrategy {

    private String name;
    private String cardNumber;
    private String cvv;
    private String dateOfExpiry;

    public CreditCardStrategy(String nm, String ccNum, String cvv, String expiryDate){
        this.name=nm;
        this.cardNumber=ccNum;
        this.cvv=cvv;
        this.dateOfExpiry=expiryDate;
    }
    @Override
    public String pay() {
        return "paid with credit/debit card";
    }
}
