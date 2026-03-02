0package DSA.corejava;

//Q1_SecureDigitalWallet.java

interface Transaction {
 void addMoney(double amount) throws InvalidAmountException;
 void transfer(DigitalWallet to, double amount) throws InvalidAmountException;
}

abstract class DigitalWallet implements Transaction {
 private String walletId;
 private String ownerName;
 private double balance;

 protected DigitalWallet(String walletId, String ownerName, double balance) {
     this.walletId = walletId;
     this.ownerName = ownerName;
     this.balance = balance;
 }

 protected double getBalance() {
     return balance;
 }

 protected void updateBalance(double amount) {
     this.balance += amount;
 }

 @Override
 public void addMoney(double amount) throws InvalidAmountException {
     if (amount <= 0) throw new InvalidAmountException("Invalid amount");
     updateBalance(amount);
 }

 public void addMoney(double amount, String mode) throws InvalidAmountException {
     addMoney(amount); // overloading
 }

 @Override
 public void transfer(DigitalWallet to, double amount)
         throws InvalidAmountException {
     if (amount <= 0) throw new InvalidAmountException("Invalid transfer");
     if (amount > balance) throw new InsufficientBalanceException("Low balance");
     updateBalance(-amount);
     to.updateBalance(amount);
 }

 public void transfer(DigitalWallet to, double amount, String remarks)
         throws InvalidAmountException {
     transfer(to, amount);
 }
}

class BasicWallet extends DigitalWallet {
 public BasicWallet(String id, String name, double bal) {
     super(id, name, bal);
 }
}

class PremiumWallet extends DigitalWallet {
 public PremiumWallet(String id, String name, double bal) {
     super(id, name, bal);
 }
}

class InvalidAmountException extends Exception {
 public InvalidAmountException(String msg) { super(msg); }
}

class InsufficientBalanceException extends RuntimeException {
 public InsufficientBalanceException(String msg) { super(msg); }
}

public class Q1_SecureDigitalWallet {
 public static void main(String[] args) {
     try {
         DigitalWallet w1 = new BasicWallet("W1", "Alice", 1000);
         DigitalWallet w2 = new PremiumWallet("W2", "Bob", 500);
         w1.addMoney(200, "UPI");
         w1.transfer(w2, 300, "Rent");
     } catch (InvalidAmountException e) {
         System.out.println(e.getMessage());
     } finally {
         System.out.println("Transaction complete");
     }
 }
}
