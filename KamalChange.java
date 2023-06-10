import java.util.Scanner;
public class KamalChange {
    public int getCurencyDenomination(int [] changeDrawer){
        int kamalMoney = 500;
        int amountSpent = 220;
        int change = kamalMoney - amountSpent;

        for( int c = 0; c < changeDrawer.length; c++){
            int num = change/changeDrawer[c];
            change = change % changeDrawer[c]; 
            if(num!=0){
                System.out.println(num+" of " +changeDrawer[c]);
            } 
        }
        return change;
 
    }
    public static void main(String[]args){
        KamalChange change = new KamalChange(); // getCurencyDenomination(new int [] {50,30,10}); //static
        Scanner input = new Scanner(System.in);
        int [] changeDrawer = new int [3];
        for(int i = 0; i < 3; i++){
            System.out.println("Kindly supply the value at index " +i );
            changeDrawer[i] = input.nextInt();
        }
         change.getCurencyDenomination(changeDrawer);  
       
    }
}
