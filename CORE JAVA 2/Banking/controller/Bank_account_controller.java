package Banking.controller;

import Banking.model.*;
import Banking.exception.*;

public class Bank_account_controller {

    private Bank_account account;

    // -------- ACCOUNT CREATION --------
    public void createAccount(int choice) {
        if (choice == 1) {
            account = new Current_account();
        } else {
            account = new Savings_account();
        }
    }


    // -------- ACCOUNT DETAILS --------
    public void setAccountNumber(int accNo) {
        account.setAccountNumber(accNo);
    }

    public int getAccountNumber() {
        return account.getAccountNumber();
    }

    public void setAccountHolderName(String name) {
        account.setAccountHolderName(name);
    }

    public String getAccountHolderName() {
        return account.getAccountHolderName();
    }

    // -------- BALANCE --------
    public double getBalance(short pin) {
        return account.getBalance(pin);
    }

    // -------- WITHDRAW (OVERLOADED) --------
    public double withdraw(double amount, short pin)
            throws InsufficientBalanceException {
        return account.setBalanceWithdrawal(amount, pin);
    }

    public double withdraw(double amount, String remarks, short pin)
            throws InsufficientBalanceException {
        return account.setBalanceWithdrawal(amount, remarks, pin);
    }

    // -------- DEPOSIT (OVERLOADED) --------
    public double deposit(double amount, short pin)
            throws InvalidAmountException {
        return account.setBalanceDeposit(amount, pin);
    }

    public double deposit(double amount, String gateway, short pin)
            throws InvalidAmountException {
        return account.setBalanceDeposit(amount, gateway, pin);
    }
}
