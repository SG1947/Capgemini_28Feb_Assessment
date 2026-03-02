package newprog;

public class Methods {
    
	public static void main(String[] args) {
		System.out.println("Start");
		m1();//method call statement 
//		Methods.m1(); //calling m1 method outside of Methods class
		System.out.println("End");

	}
	public static void m1() {
		System.out.println("From m1()");
	}

}
