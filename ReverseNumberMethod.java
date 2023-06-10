import java.util.Scanner;
public class ReverseNumberMethod {
    public int reverseNumbers(int number){
        boolean isNegative = false;
        if(number<0){
            isNegative = true;
            number*=-1;
        }
        
        long reverse = 0;
        while(number>0){
            reverse = (reverse * 10) + (number % 10);
            number/=10;
        }
        return isNegative ? (int) (-1 * reverse) : (int) (reverse);
    }
    public static void main(String[]args){
        ReverseNumberMethod reverseNumber = new ReverseNumberMethod();

        Scanner input = new Scanner(System.in);
        System.out.println("Kindly supply the number");
        int number = input.nextInt();
        int result = reverseNumber.reverseNumbers(number);
        System.out.println("The reverse number is " + result);
    }
}
