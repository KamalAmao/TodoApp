package com.kamal.classes;

public class Factorial {
    public static void main(String[] args) {
        /*
            Write a java program to print Factorial of n numbers - assume the number is 5;
            OUTPUT
            1! = 1
            2! = 2
            3! = 6;
            4! = 24
            5! = 120

            c = 1, fact = 1 -> 1!=1;
            c = 2, fact = 1 -> 2! = 2;
            c = 3, fact = 2 -> 3! = 6;
            c = 4, fact = 6 -> 4!= 24;
            c = 5, fact = 24 -> 5! = 120;

            ASSIGNMENT
            - Write a Java program to print fibonnacci series of n integers where n = 10;
              0, 1
            - Write a Java program to compute permutation of n and m factorials provided that n = 10 and m = 5; 10!/5! = 20;

         */
        int fact = 1;
        for(int c = 1; c <= 5; c++){
            fact = fact * c; // fact*=c;
            System.out.println(c+"!=" + fact);
        }

    }
}
