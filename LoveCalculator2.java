import java.util.Scanner;
import java.util.Random;
public class LoveCalculator2{
    public static void main(String[]args){
        Scanner x = new Scanner(System.in);
        System.out.println("Hello, I'm ola and I'm smart enough to determine how much your partner loves you if you can follow my instructions");
        System.out.println("Kindly provide your name");
        System.out.println("Kindly provide your patners name");
        String yourName = x.next();
        String partnerName = x.next();

        Random random = new Random();
        int randomNumber = random.nextInt(100);
        System.out.println(randomNumber);

        if((randomNumber>=80)&&(randomNumber<=100)){
            System.out.println("Congratulations " + yourName + "the love between you and " + partnerName + " is " +randomNumber+"%\nHer presence makes your life colorful and she is the reason behind that splendid smile of yours\nA wonderful person like this deserves a sweet treat!" );
        }else if((randomNumber>=50)&&(randomNumber<=80)){
            System.out.println("The love between" +yourName+ "and " +partnerName + "is " +randomNumber+ "and has a chance of working out, but on the other hand, it might not");
        }else if((randomNumber>=0)&&(randomNumber<=49)){
            System.out.println("The love level between " + yourName+ "and " + partnerName+ " is low. " +randomNumber+"% love could vanish if care is not taken\nI think your partner may be feeling neglected for a while. Give her attention she seeks and enjoy this wonderful time together");
        }
    }
}