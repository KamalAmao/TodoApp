import java.util.Random;
public class IterateDice {
    public static void main(String[]args){
        Random x = new Random();
        int score = 0;
        int c=1;
        while(c<=5){
            int dice =1 + x.nextInt(6);
            System.out.println(dice);
            c++;
            if(dice%2 == 0){
                score+=5;
            }
        }
        System.out.println("your score is "+score);
    }
}
