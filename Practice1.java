import java.util.Scanner;
public class Practice1 {
    public static void main(String[]args){
        Practice1 practice = new Practice1();

        String word = "Kamal";
        String reverse = "";
        char currentWordValue;
        for(int i = 0; i < word.length(); i++){
            currentWordValue = word.charAt(i);
            reverse = currentWordValue + reverse;
        }
        System.out.println(reverse);
      
    }
}
