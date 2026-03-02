package Week2.arrays;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int [] arr= new int[5];
		System.out.println("Start");
		Object [] arr =new Object[6]  ;
//		arr[0]=true;
//		arr[1]=(byte)1;
//		arr[2]='c';
//		arr[3]="Hello";
//		arr[4]=12234L;
//		arr[5]=1.2f;
//		arr[6]=false;//ArrayIndexOutOfBoundsException(in runtime)
//		try {
//			arr[6]=false;//ArrayIndexOutOfBoundsException(in runtime)
//		} catch (ArrayIndexOutOfBoundsException e) {
//			String message=e.getMessage();
//			System.out.println(message);
//		}
//		finally {
//			System.out.println("OK");
//		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter data");
			String input=sc.nextLine();
			if (input.length() == 1 && Character.isLetter(input.charAt(0))) {
		        arr[i] = input.charAt(0);
		    }
			else {
		        try {
		            arr[i] = Long.parseLong(input);   // try long
		        }
		        catch (Exception e1) {
		            try {
		                arr[i] = Double.parseDouble(input); // try double
		            }
		            catch (Exception e2) {
		                arr[i] = input; // string
		            }
		        }
		    }
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("End");
	}

}
