
import java.util.Scanner;
public class Bank {
    /*
        Deposit, Withdraw, Transfer, GetCustomerAccountBalance : Behavior of the App
     */

    public void deposit(double amount, String accountNo){
        if(amount > 0){
            double newBalance = amount + getAccountBalance(accountNo);
            System.out.println("Thank you for Banking with us");
        }
        System.out.println("Unfortunately, you didn't come to the bank with any cash");
    }

    public void transfer(double amount, String yourAccountNo, String recipientAccountNo){
        if(getAccountBalance(yourAccountNo) >= amount){
            double recipientNewBalance = amount + getAccountBalance(recipientAccountNo);
            double senderNewBalance = getAccountBalance(recipientAccountNo) - amount;
            System.out.println("Thank you for Banking with us");
        }
        System.out.println("Unfortunately, your balance is too low.");
    }

    public double getAccountBalance(String accountNo){ // just to hold dummy balance based on account number
        if(accountNo.startsWith("3")){
            return 12567.89;
        }
       return 100.45;
    }

    public static void main(String[] args) {
        // Employee myEmployee = new Employee();
        // myEmployee.getEmployeeName();
        Bank myBank = new Bank();
        String accountNo, recAccountNo = "";
        double amount = 0.0;

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Kamal Bank\n===================================\nPlease carefully follow this instructions\n------------------------------------\nPress 1 to Deposit\nPress 2 to Tranfer\nPress 3 to Check account Balance");
        int userOption = input.nextInt();

        switch (userOption){
            case 1:
                System.out.println("Kindly provide the amount and account number");
                amount = input.nextDouble();
                accountNo = input.next();
                myBank.deposit(amount, accountNo);
                break;
            case 2:
                System.out.println("Kindly provide the amount, your account number and recipient account number");
                amount = input.nextDouble();
                accountNo = input.next();
                recAccountNo = input.next();
                myBank.transfer(amount, accountNo, recAccountNo);
                break;
            case 3:
                System.out.println("Kindly provide your account number");
                accountNo = input.next();
                System.out.println("Your account balance is " + myBank.getAccountBalance(accountNo));
                break;
            default:
                System.out.println("Invalid Entry");
        }
    }
}
