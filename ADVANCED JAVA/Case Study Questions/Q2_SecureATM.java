package DSA.corejava;


interface Withdrawable {
 void withdraw(double amount) throws InvalidTransactionException;
}

abstract class ATMAccount implements Withdrawable {
 private String accNo;
 private String holder;
 private double balance;

 protected ATMAccount(String accNo, String holder, double balance) {
     this.accNo = accNo;
     this.holder = holder;
     this.balance = balance;
 }

 protected double getBalance() {
     return balance;
 }

 protected void debit(double amt) {
     balance -= amt;
 }

 public void withdraw(double amount, int pin) throws InvalidTransactionException {
     withdraw(amount);
 }
}

class SavingsAccount extends ATMAccount {
 public SavingsAccount(String a, String h, double b) {
     super(a, h, b);
 }

 public void withdraw(double amount) throws InvalidTransactionException {
     if (amount <= 0) throw new InvalidTransactionException("Invalid amount");
     if (amount > getBalance()) throw new InsufficientFundsException("Low balance");
     debit(amount);
 }
}

class SalaryAccount extends ATMAccount {
 public SalaryAccount(String a, String h, double b) {
     super(a, h, b);
 }

 public void withdraw(double amount) throws InvalidTransactionException {
     if (amount <= 0) throw new InvalidTransactionException("Invalid amount");
     debit(amount);
 }
}

class InvalidTransactionException extends Exception {
 public InvalidTransactionException(String msg) { super(msg); }
}

class InsufficientFundsException extends RuntimeException {
 public InsufficientFundsException(String msg) { super(msg); }
}

public class Q2_SecureATM {
 public static void main(String[] args) {
     try {
         ATMAccount acc = new SavingsAccount("101", "John", 5000);
         acc.withdraw(2000, 1234);
     } catch (InvalidTransactionException e) {
         System.out.println(e.getMessage());
     }
 }
}
