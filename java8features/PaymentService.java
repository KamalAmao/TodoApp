package com.kamal.classes.java8features;

import java.util.Comparator;

public class PaymentService implements KamalPayment {

    @Override
    public void payWithCard() {
        String txDate = KamalPayment.getPaymentDate("yyyy-MM-dd");
    }

    @Override
    public double getBalance() {
        return KamalPayment.super.getBalance();
    }
}
