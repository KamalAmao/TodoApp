package oop;

public interface BankInterface {
     double getAccountBalance(String accountNo);
     void transfer(String yourAccountNo, String recipentAccountNo, double amount);
     void deposit(String accountNo, double amount);
     double withdraw(double amount, String accountNo);
}
