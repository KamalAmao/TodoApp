import java.util.Scanner;
public class KamalChanges {
    public static void main(String[]args){
        int kamalMoney = 500;
        int amountSpent = 220;
        int change = kamalMoney - amountSpent;


        while(change>0){
            if(change>=50){
                System.out.println("No of 50 naira notes is " + (change/50));
                change = change % 50;
            }else if (change >=20){
                System.out.println("No of 20 naira notes is " + (change/20));
                change = change % 20;
            }else if(change>=10){
                System.out.println("No of 10 naira notes is " + (change/10));
                change = change % 10;
            }
        }
        //change++;
    }
}
