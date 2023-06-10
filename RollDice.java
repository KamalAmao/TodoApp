import java.util.Random;
public class RollDice {
    public static void main(String[]args){
        int score = 0;
        Random random = new Random();
        for(int c =1; c <=5; c++){
            int dice = 1 + random.nextInt(6);
            System.out.println(dice);
            if(dice%2==0){
                score+=5;
            }
        }
        System.out.println("The total score is " + score);

    }
}
