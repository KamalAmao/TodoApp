package com.kamal.classes;

import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide the number");
        int number = scanner.nextInt(); //-123 -> -321
        int result;

        boolean isNegative = false;
        if(number < 0){
            isNegative = true;
            number *= -1;
        }
        /*
            reversed = 0, number = 123: (0 *10) + (123%10) = 3
            123/10 = 12

            reversed = 3, number = 12: (3 * 10) + (12%10) = 32;
            12/10 = 1;

            reversed = 32, number = 1: (32 * 10) + (1%10) = 321;
            1/10 = 0

            on line 34, -1 * 321 = -321
         */
        long reversed = 0;
        while (number > 0){
            reversed = (reversed * 10) + (number % 10);
            number/=10;
        }

        result = isNegative ? (int) (-1 * reversed) : (int) reversed;
        System.out.println(result);
    }
}
