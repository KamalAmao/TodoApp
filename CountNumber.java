import java.util.Scanner;
public class CountNumber{
    public static void main(String[]args){
        Scanner x = new Scanner(System.in);
        String father = "Father francis fried fish for his friends in france";
        int len = father.length();
        int counter = 0;
        for(int c =0; c<len; c++){
            if(father.charAt(c)== 'f'){
                counter ++;
            }
        }
        System.out.println("The total number of f's is " + counter);
    }
}