import java.util.Scanner;
public class Bankk {
    public void deposit(double amount, String accountNo){
        if(amount>0){
            double newBalance = amount + getAccountBalance(accountNo);
            System.out.println("Thank you for banking with us");
        }
        System.out.println("Unfortunately, you didnt come to the bank with any cash");
    }
    public void transfer(double amount, String yourAccountNo, String recipentAccountNo){
            if(getAccountBalance(yourAccountNo)>=amount){
                double recipentNewBalance = amount + getAccountBalance(recipentAccountNo);
                double senderNewbalance = getAccountBalance(yourAccountNo) - amount;
                System.out.println("Thank you for banking with us");
            }
            System.out.println("Unfortunately, your balance is too low.");
    }
    /*public void withdraw(double amount, String accountNo){
        if(getAccountBalance(accountNo)>=amount){
            Double amountWithraw = getAccountBalance(accountNo) - amount;
            double newAccBalance = getAccountBalance(accountNo) - amountWithraw;
            System.out.println("Transaction completed, Take your cash."); 
        }
        System.out.println("Unfortunately, your balance is too low.");
    }*/
    public double withdraw(double amount, String accountNo){
        double newAccBalance = 0;
            if(getAccountBalance(accountNo)>=amount){
                newAccBalance = getAccountBalance(accountNo) - amount;
                System.out.println("Transaction completed, Take your cash.");
            }
            return newAccBalance;
        }
    public double getAccountBalance(String accountNo){
        if(accountNo.startsWith("3")){
            return 12567.89;
        }
        return 100.45;
    }
    public static void main(String[]args){
        Bankk myBank = new Bankk();
        String accountNo, recAccountNo = "";
        double amount = 0.0;

        Scanner input = new Scanner(System.in);
        System.out.println("Welcom to Kamal Bank\n=======================================\nPlease kindly follow this instructions\n----------------------------------------------\nPress 1 to deposit\nPress 2 to transfer\nPress 3 to withdraw\nPress 4 to check account balance");
        int userOption = input.nextInt();

        switch(userOption){
            case 1:
            System.out.println("Kindly provide the amount and acount number");
            amount = input.nextDouble();
            accountNo = input.next();
            myBank.deposit(amount,accountNo);
            break;
            case 2:
            System.out.println("Kindly provide the amount, your account number and recipent acount number");
            amount = input.nextInt();
            accountNo = input.next();
            recAccountNo = input.next();
            myBank.transfer(amount, accountNo, recAccountNo);
            break;
            case 3:
            System.out.println("Kindly provide the amount and account number");
            amount = input.nextInt();
            accountNo = input.next();
            myBank.withdraw(amount, accountNo);
            break;
            case 4:
            System.out.println("Kindly provide your account number");
            accountNo = input.next();
            System.out.println("Your acount balance is " +myBank.getAccountBalance(accountNo));
            break;
            default:
            System.out.println("Invalid entry");
        }
    }
}

