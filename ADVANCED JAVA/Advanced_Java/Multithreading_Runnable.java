package Advanced_Java;

import java.util.Scanner;
class T1 implements Runnable{
	@Override
	public void run() {
			System.out.println("Program started!");
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter num1:");
			int num1=sc.nextInt();
			System.out.println("Enter num2:");
			int num2=sc.nextInt();
			System.out.println("Sum:"+(num1+num2));
			System.out.println("Program finished!");
			
	}
}
class T2 implements Runnable{
	@Override
		public void run() {
		System.out.println("Printing characters");
		for (int i = 65; i < 75; i++) {
			System.out.println((char)i);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		}
}
class T3 implements Runnable{
	@Override
		public void run() {
		System.out.println("Printing Numbers");
		for (int i = 1; i <=10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		}
}
public class Multithreading_Runnable {
		public static void main(String[] args) {
			
			Thread t1=new Thread(new T1());
			Thread t2=new Thread(new T2());
			Thread t3=new Thread(new T3());
          
			
			
			t1.start();
			t2.start();
			t3.start();
			
		}
}
