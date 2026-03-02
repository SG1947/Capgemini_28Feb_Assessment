package newprog;

import java.util.Scanner;

public class Scannerprog {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter 3 numbers");
		short num = userInput.nextShort();
		userInput.nextLine();
		System.out.print("Enter a string");
		String st= userInput.nextLine();
		System.out.println("num : "+num);
		System.out.println("string : "+st);
		userInput.close();
       
	}

}