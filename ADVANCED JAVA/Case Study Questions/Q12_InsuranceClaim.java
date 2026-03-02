package DSA.corejava;

//Q12_InsuranceClaim.java

interface ClaimService {
 void submitClaim(double amount) throws InvalidClaimException;
}

abstract class InsuranceClaim implements ClaimService {
 private String claimId;
 private String policyHolder;
 private double claimAmount;

 protected void setClaimAmount(double amt) {
     claimAmount = amt;
 }
}

class HealthClaim extends InsuranceClaim {
 public void submitClaim(double amount) throws InvalidClaimException {
     if (amount <= 0)
         throw new InvalidClaimException("Invalid claim amount");
     setClaimAmount(amount);
 }

 public void submitClaim(double amount, String hospital)
         throws InvalidClaimException {
     submitClaim(amount);
 }
}

class VehicleClaim extends InsuranceClaim {
 public void submitClaim(double amount) throws InvalidClaimException {
     if (amount <= 0)
         throw new InvalidClaimException("Invalid claim amount");
     setClaimAmount(amount);
 }
}

class InvalidClaimException extends Exception {
 public InvalidClaimException(String msg) {
     super(msg);
 }
}

class ClaimRejectedException extends RuntimeException {
 public ClaimRejectedException(String msg) {
     super(msg);
 }
}

public class Q12_InsuranceClaim {
 public static void main(String[] args) throws InvalidClaimException {
     ClaimService c = new HealthClaim();
     c.submitClaim(25000);
 }
}

