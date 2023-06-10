package com.kamal.classes;

import java.util.Locale;

public class StringDemo {
    public static void main(String[] args) {
        String countryName = "Nigeria";
        /*
            make a call to the variable name then followed by . operator
            There are various methods/behavior of String
                toUpperCase(), charAt(0); toLowerCase();

         */
        System.out.println(countryName.charAt(0));
        System.out.println(countryName.toLowerCase());
        System.out.println(countryName.toUpperCase());
        System.out.println(countryName.substring(2, 7));

    }
}
