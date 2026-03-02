package DSA.corejava;


interface RentalService {
 void rent(int days) throws InvalidRentalException;
}

abstract class VehicleRental implements RentalService {
 private String vehicleId;
 private String customerName;
 private double rentalCharge;

 protected void setCharge(double charge) {
     rentalCharge = charge;
 }
}

class CarRental extends VehicleRental {
 public void rent(int days) throws InvalidRentalException {
     if (days <= 0) throw new InvalidRentalException("Invalid duration");
     setCharge(days * 2000);
 }

 public void rent(int days, boolean insurance)
         throws InvalidRentalException {
     rent(days);
 }
}

class BikeRental extends VehicleRental {
 public void rent(int days) throws InvalidRentalException {
     if (days <= 0) throw new InvalidRentalException("Invalid duration");
     setCharge(days * 500);
 }
}

class InvalidRentalException extends Exception {
 public InvalidRentalException(String msg) {
     super(msg);
 }
}

class OverchargeException extends RuntimeException {
 public OverchargeException(String msg) {
     super(msg);
 }
}

public class Q10_VehicleRental {
 public static void main(String[] args) throws InvalidRentalException {
     RentalService r = new CarRental();
     r.rent(3);
 }
}
