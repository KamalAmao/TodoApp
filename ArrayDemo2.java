import java.io.IOException;

public class ArrayDemo2{
    public static void main(String[]args){
        int [] age = {10, 20, 30, 40};
        int result = age[1] = age[3];
        String rainRemark = (age[3] > 50) ? "it's will be rain" : "it will not rain";
        String [] friends = {"lola", "ade", "bola", "kola"};
        //System.out.println("The sum of age at index 1 and 3 is " +result);
        //System.out.println(rainRemark);
        //System.out.println(friend[3]);
        System.out.println("Total elements in friend's array is " + friends.length);
        
    }
}