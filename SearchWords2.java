//import java.util.Random;
public class SearchWords2 {
    public static void main(String[]args){
        String word = "The teacher told tola to take the trouser to the tailor";
        int counter = 0;
        int len = word.length();
        for (int c = 0; c <len; c++) {
            if(word.charAt(c)== 't'){
                counter++;
                //System.out.println("The number of t's in the string is " +counter);
            }
            System.out.println("The number of t's in the string is " +counter);
        }
        

        /*int score = 0;
        Random x = new Random();
        int c = 1;
        while(c <=5){
            int dice = 1 + x.nextInt(6);
            System.out.println(dice);
            if(dice %2 == 0){
                score+=5;
            }
            c++;
        }
        System.out.println("The total number of score is " +score);*/
    }

