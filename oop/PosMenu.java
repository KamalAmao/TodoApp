package oop;

public class PosMenu implements PosInterface{

   
    public double Withdraw(String accountNo, double amount) {
        double newAccBal = 0;
        if(GetAccountBalance(accountNo) > amount){
            newAccBal = GetAccountBalance(accountNo) - amount;
            System.out.println("Trasaction completed, Take your cash");
            System.out.println("print slip");
        }
        return newAccBal;
    }

    public void Transfer(String yourAccountNo, String recepentAccountNo, double amount) {
       if(GetAccountBalance(yourAccountNo)>= amount){
        double recepentNewBalance = GetAccountBalance(recepentAccountNo) + amount;
        double senderNewAccBal = GetAccountBalance(yourAccountNo) - amount;
        System.out.println("Success");
       }
       System.out.println("Insufficent funds");
    }

    public void AirtimeAndData(String network) {

    }

    public void CheckBalance(double accountNo) {
       
    }

    public double GetAccountBalance(String accountNo) {
        if(accountNo.startsWith(accountNo)){
            return 10000.00;
        }
        return 0;
    }
    
}
