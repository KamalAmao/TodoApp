import java.util.Scanner;
public class ScannerPractice{
    public static void main(String[]args){
        Scanner x = new Scanner(System.in);
        System.out.println("Kindly provide me your name I'll greet you");
        String username = x.next();
        System.out.println("Hello " +username);
    }
}