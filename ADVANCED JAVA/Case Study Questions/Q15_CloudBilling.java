package DSA.corejava;

//Q15_CloudBilling.java

interface UsageService {
 void calculateUsage(double units) throws InvalidUsageException;
}

abstract class CloudResource implements UsageService {
 private String resourceId;
 private String userName;
 private double usageCost;

 protected void setCost(double cost) {
     usageCost = cost;
 }
}

class ComputeResource extends CloudResource {
 public void calculateUsage(double units) throws InvalidUsageException {
     if (units <= 0)
         throw new InvalidUsageException("Invalid usage");
     setCost(units * 10);
 }

 public void calculateUsage(double units, boolean peak)
         throws InvalidUsageException {
     calculateUsage(units);
 }
}

class StorageResource extends CloudResource {
 public void calculateUsage(double units) throws InvalidUsageException {
     if (units <= 0)
         throw new InvalidUsageException("Invalid usage");
     setCost(units * 5);
 }
}

class InvalidUsageException extends Exception {
 public InvalidUsageException(String msg) {
     super(msg);
 }
}

class BillingLimitExceededException extends RuntimeException {
 public BillingLimitExceededException(String msg) {
     super(msg);
 }
}

public class Q15_CloudBilling {
 public static void main(String[] args) throws InvalidUsageException {
     UsageService r = new ComputeResource();
     r.calculateUsage(120);
 }
}
