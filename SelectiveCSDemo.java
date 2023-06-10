package com.kamal.classes;

public class SelectiveCSDemo {
    public static void main(String[] args) {

        // If statement example
        int totalTrip = 50;
        int tripLeft = 120 - totalTrip;
        if(totalTrip >= 120){
           System.out.println("Eligible for Bonus");
        }else{
            System.out.println("You are not Eligible because you still have a total trip of " + tripLeft + " to complete");
        }

        // If..else if example
    }
}
