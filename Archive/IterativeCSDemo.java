package com.kamal.classes;

public class IterativeCSDemo {
    public static void main(String[] args) {
        /*
          Synthax and Usage
            for, while, do..while
                FOR SYNTHAX
                 for(initialization; condition; incr/decr){
                    statement/block of code;
                }
                WHILE SYNTHAX
                initialization;
                while(condition){
                    statement/block of code;
                    incr/decr;
                }
         */
        for(int c = 1; c <= 10; c++){
            if(c == 5){
                break;
            }
            System.out.println(c);
        }
        // we use break to break out/exit a loop
//
//        int i = 1;
//        while(i <= 10){
//            System.out.println(i);
//            i++;
//        }

        // Print Even numbers
//        for(int c = 1; c <= 10; c++){
//            if(c % 2 == 1){
//                System.out.println(c);
//            }
//        }
    }
}
