package com.kamal.classes.exceptions;

/*
    Exception are abnormal event that happens to disrupt the flow of a program
    - Checked Exception (Compile Time Exception)
    - Unchecked Exception (Runtime Exception)

    when an expected exception occur, java stores or keep equivalent exception name/class in exception object
 */
import java.util.InputMismatchException;
import java.util.Scanner;
public class ExceptionDemo{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter two numbers which you would like to divide");
        try{
            double x = scanner.nextInt();
            double y = scanner.nextInt();
            System.out.println(arithOps(x, y));
        }catch (Exception e){
            System.out.println("Kindly input numeric value and not characters " + e);
        }finally {
            System.out.println("Hello J!");
        }
    }

    public static int arithOps(int k, int y){
        return k + y;
    }

    public static double arithOps(double x, double y){
        return x / y;
    }

}
