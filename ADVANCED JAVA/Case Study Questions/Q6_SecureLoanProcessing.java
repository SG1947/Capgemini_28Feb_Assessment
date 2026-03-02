package DSA.corejava;

//Q6_SecureLoanProcessing.java

interface EMIService {
 void payEMI(double amount) throws InvalidLoanAmountException;
}

abstract class LoanAccount implements EMIService {
 private String loanId;
 private String applicantName;
 private double loanAmount;

 protected LoanAccount(String id, String name, double amount) {
     this.loanId = id;
     this.applicantName = name;
     this.loanAmount = amount;
 }

 protected double getLoanAmount() {
     return loanAmount;
 }

 protected void reduceLoan(double amt) {
     loanAmount -= amt;
 }
}

class HomeLoan extends LoanAccount {
 public HomeLoan(String id, String name, double amt) {
     super(id, name, amt);
 }

 public void payEMI(double amount) throws InvalidLoanAmountException {
     if (amount <= 0) throw new InvalidLoanAmountException("Invalid EMI");
     if (amount > getLoanAmount())
         throw new OverpaymentException("Overpayment not allowed");
     reduceLoan(amount);
 }

 public void payEMI(double amount, int months)
         throws InvalidLoanAmountException {
     payEMI(amount);
 }
}

class PersonalLoan extends LoanAccount {
 public PersonalLoan(String id, String name, double amt) {
     super(id, name, amt);
 }

 public void payEMI(double amount) throws InvalidLoanAmountException {
     if (amount <= 0) throw new InvalidLoanAmountException("Invalid EMI");
     reduceLoan(amount);
 }
}

class InvalidLoanAmountException extends Exception {
 public InvalidLoanAmountException(String msg) {
     super(msg);
 }
}

class OverpaymentException extends RuntimeException {
 public OverpaymentException(String msg) {
     super(msg);
 }
}

public class Q6_SecureLoanProcessing {
 public static void main(String[] args) {
     try {
         EMIService loan = new HomeLoan("L1", "Rahul", 500000);
         loan.payEMI(20000);
     } catch (InvalidLoanAmountException e) {
         System.out.println(e.getMessage());
     }
 }
}
