import java.util.Scanner;
public class Exercises {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Kindly supply the number");
        int number = input.nextInt();

        for(int i = 1; i <= number; i++){
            System.out.println("cube of " +i+ " is " +i*i*i);
        }

        for(int i = 0; i<= 5; i++){
            int j = 5; 
            int k;
            k = i*j;
                System.out.println(j+ " * " +i + " = " +k);
            
        }
        
        int sum = 0;
        System.out.println("the odd numbers are:");
        for(int i = 1; i <= number; i++){ 
                System.out.println(2*i-1);
                sum+=2*i-1;
        }
        System.out.println("The sum of odd number at " +number+ " terms is " +sum);
    }
}
