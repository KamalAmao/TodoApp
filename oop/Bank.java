package oop;

import java.util.Scanner;
public class Bank{
    public Bank(){

    }
    public static void main(String[]args){
        Bank myBank = new Bank();
        Scanner input = new Scanner(System.in);
        System.out.println("Welcom to My Bank\n=======================================\nPlease kindly follow this instructions\n----------------------------------------------\nPress 1 to deposit\nPress 2 to transfer\nPress 3 to withdraw\nPress 4 to check account balance");
        int userOption = input.nextInt();

        double amount;
        String accountNo;
        switch (userOption) {
            case 1:
                System.out.println("Kindly provide your account number and amount");
                accountNo = input.next();
                amount = input.nextDouble();
                ((BankInterface) myBank).deposit(accountNo, amount);
                break;
        
            default:
                break;
        }
    }

}
