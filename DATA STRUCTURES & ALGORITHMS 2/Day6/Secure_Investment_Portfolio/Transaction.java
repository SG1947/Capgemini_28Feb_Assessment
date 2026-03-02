package DSA.Day6.Secure_Investment_Portfolio;

enum Type{
	DEBT,EQUITY
}
class InvalidInvestmentException extends Exception{
	public InvalidInvestmentException(String message){
		super(message);
	}
}
class InvestmentRejectedException extends RuntimeException{
	public InvestmentRejectedException(String message){
		super(message);
	}
}

public interface Transaction{
	abstract void authorize();
	abstract void authorize(String securityCode);
}
