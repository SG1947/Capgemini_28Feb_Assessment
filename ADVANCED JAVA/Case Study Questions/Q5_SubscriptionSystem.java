package DSA.corejava;

//Q5_SubscriptionSystem.java

interface Renewable {
 void renew() throws InvalidSubscriptionException;
}

abstract class Subscription implements Renewable {
 private String id;
 private String user;
 private double amount;

 protected void setAmount(double amt) {
     amount = amt;
 }
}

class MonthlySubscription extends Subscription {
 public void renew() throws InvalidSubscriptionException {
     setAmount(500);
 }

 public void renew(int months) throws InvalidSubscriptionException {
     setAmount(500 * months);
 }
}

class YearlySubscription extends Subscription {
 public void renew() throws InvalidSubscriptionException {
     setAmount(5000);
 }
}

class InvalidSubscriptionException extends Exception {
 public InvalidSubscriptionException(String msg) { super(msg); }
}

class SubscriptionExpiredException extends RuntimeException {
 public SubscriptionExpiredException(String msg) { super(msg); }
}

public class Q5_SubscriptionSystem {
 public static void main(String[] args) throws InvalidSubscriptionException {
     Subscription s = new MonthlySubscription();
     s.renew();
 }
}

