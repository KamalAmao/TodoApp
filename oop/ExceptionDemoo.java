package oop;

//import java.util.InputMismatchException;
import java.util.Scanner;
public class ExceptionDemoo {
    public static void main(String[]args){
       Scanner scanner = new Scanner(System.in);
       System.out.println("kindluy suplly the numbers to be added"); 
       try{
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println(aritOps(x,y));
       }catch (Exception e){
        System.out.println("Kindly input numeric value not character" +e);
       }finally{
        System.out.println("Hi there!");
       }
    }

    public static int aritOps(int x, int y) {
        return x + y;
    }
}
