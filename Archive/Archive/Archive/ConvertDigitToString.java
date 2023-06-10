package com.kamal.classes;

import java.util.Scanner;
public class ConvertDigitToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide the number");
        int digit = scanner.nextInt();
        /*
          123 = "123"
          i = 123, digits[123%10] = 3: 0 + "" = "3"
          i = 12, digits[12%10] = 2: "0" + "2" = "23"
          i = 1, digits[1%10] = 1: "1" + "20" = "123"
        */
        String[]digits = {"0","1","2","3","4","5","6","7","8","9","10"};
        String convertedDigit = "";

//        for(int i = digit; i > 0; i/=10){
//            convertedDigit = digits[i%10] + convertedDigit;
//        }
        while(digit > 0){
            convertedDigit = digits[digit%10] + convertedDigit;
            digit/=10;
        }
        System.out.println(convertedDigit);
    }
}
