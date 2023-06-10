import java.util.Scanner;
public class ConvertDigitToString {
    public String convertDigit(int digit){
        String [] digits = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        String convertedDigit = "";

        while(digit>0){
            convertedDigit = digits[digit%10] + convertedDigit;
            digit/=10;
        }
        return convertedDigit;
        }
    
    public static void main(String[]args){
        ConvertDigitToString convertNumberToString = new ConvertDigitToString();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kindly supply the number");
        int digit = scanner.nextInt();
        String result = convertNumberToString.convertDigit(digit);
        System.out.println(result);


        /*String [] digits = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        String convertedDigit = "";

        for(int i = digit; i >0; i/=10){
            convertedDigit = digits[i%10] + convertedDigit;
        }
        System.out.println(convertedDigit);*/
    }
}
