package DSA.corejava;

interface OrderService {
 void processOrder(double amount) throws InvalidOrderException;
}

abstract class FoodOrder implements OrderService {
 private String orderId;
 private String customerName;
 private double orderAmount;

 protected void setAmount(double amt) {
     orderAmount = amt;
 }
}

class RegularOrder extends FoodOrder {
 public void processOrder(double amount) throws InvalidOrderException {
     if (amount <= 0)
         throw new InvalidOrderException("Invalid order");
     setAmount(amount);
 }

 public void processOrder(double amount, String mode)
         throws InvalidOrderException {
     processOrder(amount);
 }
}

class ExpressOrder extends FoodOrder {
 public void processOrder(double amount) throws InvalidOrderException {
     if (amount <= 0)
         throw new InvalidOrderException("Invalid order");
     setAmount(amount + 50); // express charge
 }
}

class InvalidOrderException extends Exception {
 public InvalidOrderException(String msg) {
     super(msg);
 }
}
//
//class PaymentFailedException extends RuntimeException {
// public PaymentFailedException(String msg) {
//     super(msg);
// }
//}

public class Q14_FoodOrderSystem {
 public static void main(String[] args) throws InvalidOrderException {
     OrderService o = new ExpressOrder();
     o.processOrder(600);
 }
}

