package DSA.corejava;

//Q4_HospitalBilling.java

interface Billable {
 void calculateBill(double amount) throws InvalidBillException;
}

abstract class PatientAccount implements Billable {
 private String id;
 private String name;
 private double bill;

 protected void setBill(double b) {
     bill = b;
 }
}

class GeneralPatient extends PatientAccount {
 public void calculateBill(double amount) throws InvalidBillException {
     if (amount < 0) throw new InvalidBillException("Invalid bill");
     setBill(amount);
 }
}

class InsuredPatient extends PatientAccount {
 public void calculateBill(double amount) throws InvalidBillException {
     if (amount < 0) throw new InvalidBillException("Invalid bill");
     setBill(amount * 0.7);
 }

 public void calculateBill(double amount, String insurance)
         throws InvalidBillException {
     calculateBill(amount);
 }
}

class InvalidBillException extends Exception {
 public InvalidBillException(String msg) { super(msg); }
}

class PaymentNotAllowedException extends RuntimeException {
 public PaymentNotAllowedException(String msg) { super(msg); }
}

public class Q4_HospitalBilling {
 public static void main(String[] args) throws InvalidBillException {
     PatientAccount p = new InsuredPatient();
     p.calculateBill(10000);
 }
}
