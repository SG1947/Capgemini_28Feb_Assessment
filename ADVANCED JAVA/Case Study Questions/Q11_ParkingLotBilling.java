package DSA.corejava;

//Q11_ParkingLotBilling.java

interface ParkingService {
 void calculateFee(int hours) throws InvalidParkingException;
}

abstract class ParkingAccount implements ParkingService {
 private String vehicleNumber;
 private String ownerName;
 private double parkingFee;

 protected void setFee(double fee) {
     parkingFee = fee;
 }
}

class TwoWheeler extends ParkingAccount {
 public void calculateFee(int hours) throws InvalidParkingException {
     if (hours <= 0)
         throw new InvalidParkingException("Invalid parking duration");
     setFee(hours * 20);
 }

 public void calculateFee(int hours, boolean night)
         throws InvalidParkingException {
     calculateFee(hours);
 }
}

class FourWheeler extends ParkingAccount {
 public void calculateFee(int hours) throws InvalidParkingException {
     if (hours <= 0)
         throw new InvalidParkingException("Invalid parking duration");
     setFee(hours * 50);
 }
}

class InvalidParkingException extends Exception {
 public InvalidParkingException(String msg) {
     super(msg);
 }
}

class BillingErrorException extends RuntimeException {
 public BillingErrorException(String msg) {
     super(msg);
 }
}

public class Q11_ParkingLotBilling {
 public static void main(String[] args) throws InvalidParkingException {
     ParkingService p = new FourWheeler();
     p.calculateFee(5);
 }
}

