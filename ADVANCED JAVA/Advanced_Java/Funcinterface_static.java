package Advanced_Java;

import java.util.function.BiFunction;

@FunctionalInterface
interface MyBiPrinter {
    void print(int a, int b);
}

class Funcinterface_static {
	public class Multithreading_Runnable {
		public static void main(String[] args) {
			Thread1 thread1=new Thread1();
			Thread2 thread2=new Thread2();
			Thread3 thread3=new Thread3();
			
			Thread t1=new Thread(thread1);
			Thread t2=new Thread(thread2);
			Thread t3=new Thread(thread3);
			
			//sequential
	//		t1.run();
	//		t2.run();
	//		t3.run();
	//		
	
			t1.start();
			t2.start();
			t3.start();
	
		}
	
	}

	public static int calculateSum(int n1, int n2) {
	    return n1+n2;
	}
    public static void print(int n1, int n2) {
        System.out.println(n1 + n2);
    }

    public static void main(String[] args) {
    	    MyBiPrinter p = (n1,n2) ->System.out.println(n1 + n2);
    	    p.print(5, 6);
        MyBiPrinter p1 = Funcinterface_static::print;
        p1.print(5, 6);
           
        BiFunction<Integer, Integer, Integer> b=(n1,n2)-> n1+n2;
        System.out.println(b.apply(2, 3));
        BiFunction<Integer, Integer, Integer> b1= Funcinterface_static::calculateSum;
        System.out.println(b1.apply(2, 3));
        
        
    }
}
