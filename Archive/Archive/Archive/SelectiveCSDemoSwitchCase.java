package com.kamal.classes;

import java.util.Scanner;
public class SelectiveCSDemoSwitchCase {
    public static void main(String[] args) {
        /*
            switch(variable){
                case condition:
                     statement
                      break;
                case condition:
                     statement
                     break;
                 default:
                       //statement
            }
         */
       Scanner scanner = new Scanner(System.in);
       System.out.println("Kindly supply a numeric value between 1 - 12 and i will tell you the month equivalent");
       int month = scanner.nextInt();

       switch (month){
           case 1:
               System.out.println("JANUARY");
               break;
           case 2:
               System.out.println("FEBRUARY");
               break;
           case 3:
               System.out.println("MARCH");
               break;
           default:
               System.out.println("This is an Invalid month");
       }
    }
}
