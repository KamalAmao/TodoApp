import java.util.Scanner;
public class PrintNaturalNumberAndSum {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int i, number, sum = 0;
        System.out.println("Kindly supply the number");
        number = input.nextInt();
        System.out.println("the first n natural numbers are : "+number);
        
        for(i = 1; i <= number; i++){
            System.out.println(i);
            sum+=i;
        }
        
        System.out.println("The sum of natural numbers on n terms : "+sum);
    }
}
