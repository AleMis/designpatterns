package com.designpatterns.patterns.strategy.payments;

public class PaypalStrategy implements PaymentsStrategy {

    private String emailId;
    private String password;

    public PaypalStrategy(String email, String pwd){
        this.emailId=email;
        this.password=pwd;
    }

    public String pay() {
        return "paid using Paypal";
    }
}
