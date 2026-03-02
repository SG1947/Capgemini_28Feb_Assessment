package Week2.arrays;

import java.util.Scanner;

public class usermult {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int [][]arr=new int[2][2];
		System.out.println("Enter elements: ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j]=input.nextInt();
			}
		}
		System.out.println("Printing elements: ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.println(arr[i][j]);
			}
		}
		

	}

}
