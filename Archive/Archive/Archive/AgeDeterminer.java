package com.kamal.classes;

import java.util.Scanner;
public class AgeDeterminer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kindly enter your age and your friends age");
        int fr1 = scanner.nextInt();
        int fr2 = scanner.nextInt();
        if(fr1 > fr2){
            System.out.println("The first friend is the oldest he is " + (fr1-fr2) + " older than second friend");
        } else if(fr1 == fr2){
            System.out.println("Una be mate!");
        } else{
            System.out.println("The second friend is the oldest he is " + (fr2-fr1) + " older than first friend");
        }
    }
}
