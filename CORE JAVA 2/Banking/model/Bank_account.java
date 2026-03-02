package Banking.model;

import Banking.exception.InsufficientBalanceException;
import Banking.exception.InvalidAmountException;

public interface Bank_account {

	public abstract int getAccountNumber();

	public abstract void setAccountNumber(int accountNumber);

	public abstract String getAccountHolderName();

	public abstract void setAccountHolderName(String accountHolderName);

	public abstract double getBalance(short pin);

	public abstract double setBalanceWithdrawal(double withdrawalAmount, short pin) throws InsufficientBalanceException;

	public abstract double setBalanceWithdrawal(double withdrawalAmount, String Remarks, short pin)
			throws InsufficientBalanceException;

	public abstract double setBalanceDeposit(double depositedAmount, short pin) throws InvalidAmountException;

	public abstract double setBalanceDeposit(double depositedAmount, String PaymentGateway, short pin)
			throws InvalidAmountException;
}
