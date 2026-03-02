package Advanced_Java;

import java.util.Scanner;

class PINException extends Exception{
	public PINException(String message) {
		super(message);
	}
}
class ExceedException extends Exception{
	public ExceedException(String message) {
		super(message);
	}
}
class verify{
	private int pin=1234;
	public boolean check(int pin, int attempt) throws PINException,ExceedException{
		if(attempt<=3) {
			if(this.pin!=pin) {
				throw new PINException("Incorrect password entered");
			}
			else {
				System.out.println("Pin validation successful");
				return true;
			}
		}
		if(attempt>3)  {
			throw new ExceedException("Limit exceeded . Try again later");
		}
		return false;
	}
}
public class ATMVerification {

	public static void main(String[] args) {
		verify vr=new verify();
		Scanner sc=new Scanner(System.in);
		
		int attempts=1;
		while(true) {
			int pin=sc.nextInt();
			try {
				boolean res=vr.check(pin, attempts) ;
				if(res==true) break;
			} 
          catch (ExceedException e) {
				System.out.println(e.getMessage());
				break;
			}
			catch (PINException e) {
				System.out.println(e.getMessage());
				
			} 
			attempts++;
		}

	}

}
