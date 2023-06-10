package oop;

public class BankMenu implements BankInterface {
    public double getAccountBalance(String accountNo){
        if(accountNo.startsWith("4")){
            return 12000.00;
        }
        return 400.00;
    }
    public void deposit(String accountNo, double amount){
        if(amount > 0){
            double newBal = amount + getAccountBalance(accountNo); 
            System.out.println("Thanks for banking with us");
        }
        System.out.println("You do not come to the bank with any cash");
    }
    public double withdraw(double amount, String accountNo){
        double newAccBal = 0;
        if (getAccountBalance(accountNo) >= amount){
            newAccBal = getAccountBalance(accountNo) - amount;
            System.out.println("Trasaction completed, Take your cash");
        }
        return newAccBal;
    }
    public void transfer(String yourAccountNo, String recipentAccountNo, double amount){
        if(getAccountBalance(yourAccountNo)>= amount){
            double recipentNewBalance = amount + getAccountBalance(recipentAccountNo);
            double senderNewAccBal = getAccountBalance(yourAccountNo) - amount;
            System.out.println("Transaction completed");
        }
        System.out.println("Not sufficent fund");
    }
}
