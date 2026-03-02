package Banking.model;

import Banking.exception.InsufficientBalanceException;
import Banking.exception.InvalidAmountException;

public class Current_account implements Bank_account {
	private int currentAccountNumber;
	private String currentAccountHolderName;
	private double currentBalance = 1000;
	short pin = 9684;

	@Override
	public int getAccountNumber() {
		return currentAccountNumber;
	}

	@Override
	public void setAccountNumber(int accountNumber) {
		this.currentAccountNumber = accountNumber;
	}

	@Override
	public String getAccountHolderName() {
		return currentAccountHolderName;
	}

	@Override
	public void setAccountHolderName(String accountHolderName) {
		this.currentAccountHolderName = accountHolderName;
	}

	@Override
	public double getBalance(short pin) {
		if (this.pin != pin) {
			return -1;
		}
		return currentBalance;
	}

	@Override
	public double setBalanceWithdrawal(double withdrawalAmount, short pin) throws InsufficientBalanceException {
		if (this.pin != pin) {
			return -1;
		}
		if (this.currentBalance < withdrawalAmount) {
			throw new InsufficientBalanceException("Amount can't be withdrawn as it exceeds balance");
		}
		this.currentBalance -= withdrawalAmount;
		return 1;

	}

	@Override
	public double setBalanceWithdrawal(double withdrawalAmount, String Remarks, short pin)
			throws InsufficientBalanceException {
		if (this.pin != pin) {
			return -1;
		}
		if (this.currentBalance < withdrawalAmount) {
			throw new InsufficientBalanceException("Amount can't be withdrawn as it exceeds balance");
		}

		this.currentBalance -= withdrawalAmount;
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
			this.currentBalance += depositedAmount;
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
		this.currentBalance += depositedAmount;

		return 1;
	}

}
