import java.util.Scanner;
public class SumAndAverage {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int number = 0, sum = 0;
        double average = 0;
        for(int i = 0; i<5; i++){
            System.out.println("Kindly supply the numbers");
            number = input.nextInt();
            sum +=number;
        }
        average = sum/5;
        System.out.println("The sum of 5 numbers is " +sum+"\nThe average is " +average);
    }
}
