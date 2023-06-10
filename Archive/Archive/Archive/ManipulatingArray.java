package com.kamal.classes;

import java.util.Scanner;
public class ManipulatingArray {
    public static void main(String[] args) {
//        Scanner x = new Scanner(System.in);
//        System.out.println("Kindly provide 3 names of your friends and i will tell you number of those who name length are more than 6");
//        String[]friendNames = new String[3];
//
//        int counter = 0;
//        for(int i = 0; i < 3; i++){
//            friendNames[i] = x.next();
//            if(friendNames[i].length() >= 6){
//                counter++;
//            }
//        }
//        System.out.println("The total number is " + counter);
//
//        String[]fruitBasket = {"apple", "water-melon", "banana", "Guava"};
//        for(int c = 0; c < fruitBasket.length; c++) {
//            System.out.println(fruitBasket[c]);
//        }

        int [] evenOddNumber = {3, 6, 1, 8, 92, 32, 18, 11, 41, 76};
        int evenCount = 0, oddCount = 0;
        for(int c = 0; c < evenOddNumber.length; c++){
            if(evenOddNumber[c] % 2 == 0){
                evenCount++;
            }else {
                oddCount++;
            }
        }
        System.out.println("Even number is " + evenCount + "\nOdd number is " + oddCount);


        /*
           1. Kamal stepped out to buy some provisions in the supermarket, he bought goods worth of N220; He then gives
           the cashier N500, how much in Naira denominations would Kamal receive as change provided that the amount
           variations in cashier box is N50, N20, N10, N5
                OUTPUT - 5XN50 Note
                         1x20 Note
                         1X10 Note

            2. Write a Java program to convert digit to string

            3. Write a Java program to check if a string is a balanced or not. e.g
            {{}} - true
            {} - true
            {{} - false

            4. Write a Java program to reverse a String e.g Kamal, the output will be lamak
            5. Write a Java program to reverse a number e.g -123 = -321
            6. Write a Java program to space this given word - iLoveJava

         */

    }
}
