package Banking.model;

import Banking.exception.InsufficientBalanceException;
import Banking.exception.InvalidAmountException;

public class Savings_account implements Bank_account {
	private int savingsAccountNumber;
	private String savingsAccountHolderName;
	private double savingsBalance = 10000;
	short pin = 8945;

	@Override
	public int getAccountNumber() {
		return savingsAccountNumber;
	}

	@Override
	public void setAccountNumber(int accountNumber) {
		this.savingsAccountNumber = accountNumber;
	}

	@Override
	public String getAccountHolderName() {
		return savingsAccountHolderName;
	}

	@Override
	public void setAccountHolderName(String accountHolderName) {
		this.savingsAccountHolderName = accountHolderName;
	}

	@Override
	public double getBalance(short pin) {
		if (this.pin != pin) {
			return -1;
		}
		return savingsBalance;
	}

	@Override
	public double setBalanceWithdrawal(double withdrawalAmount, short pin) throws InsufficientBalanceException {
		if (this.pin != pin) {
			return -1;
		}
		if (this.savingsBalance < withdrawalAmount) {
			throw new InsufficientBalanceException("Amount can't be withdrawn as it exceeds balance");
		}
		this.savingsBalance -= withdrawalAmount;
		return 1;

	}

	@Override
	public double setBalanceWithdrawal(double withdrawalAmount, String Remarks, short pin)
			throws InsufficientBalanceException {
		if (this.pin != pin) {
			return -1;
		}
		if (this.savingsBalance < withdrawalAmount) {
			throw new InsufficientBalanceException("Amount can't be withdrawn as it exceeds balance");
		}

		this.savingsBalance -= withdrawalAmount;
		System.out.println(Remarks);
		return 1;
	}

	@Override
	public double setBalanceDeposit(double depositedAmount, String PaymentGateway, short pin)
			throws InvalidAmountException {
		if (this.pin != pin) {
			return -1;
		}
		if (depositedAmount < 0) {
			throw new InvalidAmountException("Amount must be greater than 0");
		}
		if (PaymentGateway.equals("Razorpay") || PaymentGateway.equals("Bhimpay")) {
			this.savingsBalance += depositedAmount;
		} else {
			System.out.println("Enter a valid payment gateway");
		}
		return 1;
	}

	@Override
	public double setBalanceDeposit(double depositedAmount, short pin) throws InvalidAmountException {
		if (this.pin != pin) {
			return -1;
		}
		if (depositedAmount < 0) {
			throw new InvalidAmountException("Amount must be greater than 0");
		}
		this.savingsBalance += depositedAmount;

		return 1;
	}

}
