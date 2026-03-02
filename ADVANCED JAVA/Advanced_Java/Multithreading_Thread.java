package Advanced_Java;

import java.util.Scanner;
class Thread1 extends Thread{
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
class Thread2 extends Thread{
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
class Thread3 extends Thread{
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
public class Multithreading_Thread {
//Thread is a set of instructions that will execute independently
	public static void main(String[] args) {
		
		Thread1 t1=new Thread1();
		Thread2 t2=new Thread2();
		Thread3 t3=new Thread3();
		
		//sequential
//		t1.run();
//		t2.run();
//		t3.run();
		
		//multithreading
		t1.start();
		t2.start();
		t3.start();
		t1.start();
		
		
//		System.out.println("Program started!");
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter num1:");
//		int num1=sc.nextInt();
//		System.out.println("Enter num2:");
//		int num2=sc.nextInt();
//		System.out.println("Sum:"+(num1+num2));
//		System.out.println("Program finished!");
//		
//		System.out.println("Printing characters");
//		for (int i = 65; i < 75; i++) {
//			System.out.println((char)i);
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
//		
//		System.out.println("Printing Numbers");
//		for (int i = 1; i <=10; i++) {
//			System.out.println(i);
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}

	}

}
