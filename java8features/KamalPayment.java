//package com.kamal.classes.java8features;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

@FunctionalInterface
public interface KamalPayment{
    void payWithCard();
    default double getBalance(){
        return new Random().nextDouble();
    }
    static String getPaymentDate(String pattern){
        SimpleDateFormat smp = new SimpleDateFormat(pattern);//dd-MM-yyyy, MM-DD-YYYY
        return smp.format(new Date());
    }
}
