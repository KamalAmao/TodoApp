package com.kamal.classes;

import java.util.Scanner;
public class PerimeterOfRect {
    public static void main(String[] args) {
        // p = 2(L+B);
        Scanner x = new Scanner(System.in);
        System.out.println("Kindly supply the value of Length and Breadth");
        double len = x.nextDouble();
        double bre = x.nextDouble();

        double p = 2 * (len + bre);
        System.out.println("The perimeter of a rectangle is " + p);

    }
}
