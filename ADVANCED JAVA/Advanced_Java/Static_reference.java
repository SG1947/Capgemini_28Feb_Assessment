package Advanced_Java;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.ObjIntConsumer;
import java.util.function.Predicate;

public class Static_reference {
	public static void printSum(int n1, int n2) {
	    System.out.println(n1 + n2);
	}
	public static int calculateSum(int n1, int n2) {
	    return n1+n2;
	}
	public static boolean check(int n1) {
	    return n1>1;
	}
	
	public static void main(String[] args) {
		Function<Integer, Double> f= (n)->{return Math.sqrt(n);};
		System.out.println(f.apply(4));
		
		
		
		Function<Integer, Double> f1=Math::sqrt;
		System.out.println(f1.apply(16));
		
		BiConsumer<Integer, Integer> f2= (n1,n2)->Static_reference.printSum(n1, n2);
		f2.accept(2, 3);
		BiConsumer<Integer, Integer> f3= Static_reference::printSum;
		f3.accept(2, 3);
		
		BiFunction<Integer, Integer, Integer> f4 =Static_reference::calculateSum;
		System.out.println(f4.apply(2, 3));
		
		Predicate<Integer>p =Static_reference::check;
		System.out.println(p.test(3));
		
		

	}

}




