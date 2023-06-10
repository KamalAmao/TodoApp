package oop;

public interface PosInterface {
    double GetAccountBalance(String accountNo);
    double Withdraw(String accountNo, double amount);
    void Transfer(String yourAccountNo, String recepentAccountNo, double amount);
    void AirtimeAndData(String network, double amount);
    void CheckBalance(double accountNo);
}
