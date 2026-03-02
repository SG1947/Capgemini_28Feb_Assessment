package DSA.corejava;

//Q3_OnlinePayment.java

interface Payable {
 void pay(double amount) throws InvalidPaymentException;
}

abstract class Payment implements Payable {
 private String txnId;
 private String user;
 private double amount;

 protected Payment(String id, String user) {
     this.txnId = id;
     this.user = user;
 }

 protected void setAmount(double amt) {
     this.amount = amt;
 }
}

class CreditCardPayment extends Payment {
 public CreditCardPayment(String id, String u) {
     super(id, u);
 }

 public void pay(double amount) throws InvalidPaymentException {
     if (amount <= 0) throw new InvalidPaymentException("Invalid payment");
     setAmount(amount);
 }

 public void pay(double amount, int otp) throws InvalidPaymentException {
     pay(amount);
 }
}

class UPIPayment extends Payment {
 public UPIPayment(String id, String u) {
     super(id, u);
 }

 public void pay(double amount) throws InvalidPaymentException {
     if (amount <= 0) throw new InvalidPaymentException("Invalid payment");
     setAmount(amount);
 }
}

class InvalidPaymentException extends Exception {
 public InvalidPaymentException(String msg) { super(msg); }
}

class PaymentFailedException extends RuntimeException {
 public PaymentFailedException(String msg) { super(msg); }
}

public class Q3_OnlinePayment {
 public static void main(String[] args) {
     try {
         Payable p = new CreditCardPayment("TXN1", "UserA");
         p.pay(1500);
     } catch (InvalidPaymentException e) {
         System.out.println(e.getMessage());
     }
 }
}
