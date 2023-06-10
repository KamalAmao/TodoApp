import java.util.Scanner;
import java.util.Random;
public class LoveCalculatorr {
    public static void main(String[]args){
        Scanner x = new Scanner(System.in);
        System.out.println("Hey my name is kamal, I'M smart enough to determine how much your patner loves you if you can follow my instruction");
        System.out.println("Kindly provide your name and your partner's name");
        String yourName = x.next();
        String partnerName = x.next();

        Random random = new Random();
        int randomNumber = random.nextInt(100);

        if((randomNumber >= 70)&&(randomNumber <=100)){
            System.out.println("Congratulations " +yourName+ " your love with " +partnerName+ " is " +randomNumber+"%. You are compatible");
        }else if((randomNumber >= 0)&&(randomNumber <=69)){
            System.out.println("Hmm"+yourName+ "your love with " +partnerName+ "is " +randomNumber+"%. Fix things between eachother or else you are not compatible");
        }
    }
}