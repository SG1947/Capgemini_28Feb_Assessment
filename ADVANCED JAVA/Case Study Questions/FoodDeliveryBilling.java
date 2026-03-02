package DSA.corejava;

import java.math.BigDecimal;

interface payment{
	abstract void payBill(double amount) throws InvalidOrderException;
	abstract void payBill(double amount, String couponCode) throws InvalidOrderException;
}
abstract class OrderPayment implements payment {
	private int orderId;
	private String customerName;
	private double billAmount;
	OrderPayment(int orderId,String customerName ,double billAmount){
		this.orderId=orderId;
		this.customerName=customerName;
		this.billAmount=billAmount;
	}
	public double getAmount() {
		return billAmount;
	}
	public void updateAmount(double amount) {
		this.billAmount+=amount;
	}
}
class RegularCustomer extends OrderPayment{

	RegularCustomer(int orderId, String customerName, double billAmount) {
		super(orderId, customerName, billAmount);
	}

	@Override
	public void payBill(double amount)throws InvalidOrderException {
		if(amount<0) {
			throw new InvalidOrderException("Amount must be greater than 0");
		}
	}

	@Override
	public void payBill(double amount, String couponCode) throws InvalidOrderException {
		if(amount<0) {
			throw new InvalidOrderException("Amount must be greater than 0");
		}
		if(!couponCode.equals("VALID")) {
			throw new PaymentDeclinedException(couponCode);
		}
		updateAmount(amount);
	}
	
}
class PremiumCustomer extends OrderPayment{

	PremiumCustomer(int orderId, String customerName, double billAmount) {
		super(orderId, customerName, billAmount);
	}

	@Override
	public void payBill(double amount) throws InvalidOrderException {
		if(amount<0) {
			throw new InvalidOrderException("Amount must be greater than 0");
		}
		
	}
	@Override
	public void payBill(double amount, String couponCode) throws InvalidOrderException {
		if(amount<0) {
			throw new InvalidOrderException("Amount must be greater than 0");
		}
		if(!couponCode.equals("VALID")) {
			throw new PaymentDeclinedException(couponCode);
		}
		
	}
	
}
class InvalidOrderException extends Exception {
	public InvalidOrderException(String message) {
		super(message);
	}
}
class PaymentDeclinedException extends RuntimeException{
	public PaymentDeclinedException(String message) {
		super(message);
	}
}
public class FoodDeliveryBilling {
public static void main(String[] args) {
	try {
		OrderPayment py=new RegularCustomer(0, "ABC", 10.56);
		RegularCustomer rc=(RegularCustomer)py;
		py.updateAmount(77);
		py.payBill(9000);
		py.payBill(6000, "VALID");
		System.out.println(py.getAmount());	
	}
	catch(InvalidOrderException | PaymentDeclinedException e) {
		System.out.println(e.getMessage());
	}
	
}
}
