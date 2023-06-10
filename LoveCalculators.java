import java.util.Scanner;
import java.util.Random;
public class LoveCalculators{
    public String loveCal(String yourName, String partnerName){
        Random random = new Random();
        int randomNumber = random.nextInt(100);

        if((randomNumber >= 70)&&(randomNumber<=100)){
        System.out.println("Hey, Congratulation" +yourName+ "You and " +partnerName+ " are compatible");
    }else if((randomNumber>=0)&&(randomNumber<=69)){
        System.out.println("Hmm, You are not compatible because "+randomNumber+"% of love wont yeild to anything");
        }
        return yourName + partnerName;
    }
    public static void main(String[]args){
        LoveCalculators love = new LoveCalculators();
        Scanner x = new Scanner(System.in);
        System.out.println("Kindly suply your name");
        System.out.println("Kindly supply your partners name");
        String yourName = x.next();
        String parnerName = x.next();
        //String name;
        String result = love.loveCal(yourName, parnerName);
        System.out.println(result);

        /*Random random = new Random();
        int randomNumber = random.nextInt(100);

        if((randomNumber >= 70)&&(randomNumber<=100)){
        System.out.println("Hey, Congratulation" +yourName+ "You and "+parnerName+ "are compatible");
    }else if((randomNumber>=0)&&(randomNumber<=69)){
        System.out.println("Hmm, You are not compatible because "+randomNumber+"% of love wont yeild to anything");
        }*/
    }
}