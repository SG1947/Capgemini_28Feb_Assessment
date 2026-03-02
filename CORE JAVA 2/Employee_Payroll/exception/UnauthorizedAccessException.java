package Employee_Payroll.exception;

public class UnauthorizedAccessException extends RuntimeException{

	public UnauthorizedAccessException(String message) {
		super(message);
	}
    
}
