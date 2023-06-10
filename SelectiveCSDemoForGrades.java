package com.kamal.classes;

import java.util.Scanner;
public class SelectiveCSDemoForGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hey there, my name is Kamal, and i am smart to determine your grade based on your score\nKindly follow my instructions\n===========================================================");
        System.out.println("Kindly supply your name");
        String studentName = scanner.next();
        System.out.println("Kindly supply your score");
        int score = scanner.nextInt();

        /*
         70 - 100 : A
         60 - 69: B
         50 - 59: C
         45 - 49: D
         0 - 44: F
         */

        if((score >= 70) && (score <= 100)){
            System.out.println(studentName + ", your Grade is A");
        } else if((score >= 60) && (score <= 69)){
            System.out.println(studentName + ", your Grade is B");
        }else if((score >= 50) && (score <= 59)){
            System.out.println(studentName + ", your Grade is C");
        }else if((score >= 45) && (score <= 49)){
            System.out.println(studentName + ", your Grade is D");
        }else{
            System.out.println(studentName + ", your Grade is F");
        }
    }
}
