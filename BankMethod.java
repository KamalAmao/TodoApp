import java.util.Scanner;
public class BankMethod {
    public void deposit(double amount, String accountNo){
        if(amount>0){
            double newAccBal= amount + getAccountBalance(accountNo);
            System.out.println("Thanks for banking with us");
        }
        System.out.println("Unfortunately, You didn't come to the bank with any cash");
    }
    public void transfer(double amount, String yourAccountNo, String recipentAccountNo){
        if(getAccountBalance(yourAccountNo) >= amount){
            double recipentNewAccountBal = amount + getAccountBalance(recipentAccountNo);
            double senderNewAccBal = getAccountBalance(yourAccountNo) - amount;
        }
    }
    public double withdraw(double amount, String accountNo){
        double newAccBal = 0;
        if(getAccountBalance(accountNo)>=amount){
            newAccBal = getAccountBalance(accountNo) -  amount;
        }
        System.out.println("Transaction completed, Take your cash.");
        return newAccBal;
    }
    public double getAccountBalance(String accountNo){
        if(accountNo.startsWith("3")){
            return 12345.60;
        }
        return 200.10;
    }
    public static void main(String[]args){
        BankMethod myBank = new BankMethod();
        String accountNo, recAccountNo = " ";
        double amount = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Kamal Bank\n===================================\nPlease carefully follow this instructions\n------------------------------------\nPress 1 to Deposit\nPress 2 to Tranfer\nPress 3 withdraw\npress 4 to Check account Balance");
        int userOption = input.nextInt();

        switch (userOption){
            case 1:
                System.out.println("Kindly provide the amount and account number");
                amount = input.nextInt();
                accountNo = input.next();
                myBank.deposit(amount, accountNo);
                break;
            case 2:
                System.out.println("Kindly provide the amount and your account number and recipent account number");
                amount = input.nextInt();
                accountNo = input.next();
                recAccountNo = input.next();
                myBank.transfer(amount, accountNo, recAccountNo);
                break;
            case 3:
                System.out.println("Kindly provide the amount and account number");
                amount = input.nextInt();
                accountNo = input.next();
                //myBank.withdraw(amount, accountNo);
                System.out.println("Your account balance is " + myBank.withdraw(amount, accountNo));
                break;
            case 4:
                System.out.println("Kindly provide your account number");
                accountNo = input.next();
                //myBank.getAccountBalance(accountNo);
                System.out.println("Your account balance is " + myBank.getAccountBalance(accountNo));
                break;
            default:
                System.out.println("Invalid Entry");
        }

    }
}
