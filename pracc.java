import java.util.Scanner;
public class pracc {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int kamalMoney = 500;
        int amountSpent = 220;
        int change = kamalMoney - amountSpent;
        //int [] changeDrawer = {50, 20, 10};
        int [] changeDrawer = new int [3];
        for(int i = 0; i < 3; i++){
            System.out.println("Kindly supply change at the index of " +i);
            changeDrawer[i] = input.nextInt();
            int num = change/changeDrawer[i];
            change = change%changeDrawer[i];
            if(num != 0){
                System.out.println(num + " of " +changeDrawer[i]);
            }
        }
    }
}
