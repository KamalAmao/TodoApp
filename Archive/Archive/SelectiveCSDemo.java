package com.kamal.classes;

import java.util.Scanner;
public class SelectiveCSDemo {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Kindly supply the total number of trips covered");
        // If statement example

        int totalTrip = x.nextInt();
        int tripLeft = 120 - totalTrip;
        if(totalTrip >= 120){
            System.out.println("Eligible for Bonus");
        }else{
            System.out.println("You are not Eligible because you still have a total trip of " + tripLeft + " to complete");
        }

        // If..else if example
    }
}
