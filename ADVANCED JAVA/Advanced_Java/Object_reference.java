package Advanced_Java;

import java.util.function.Function;

interface Demo{
	public int square(int n);
}
interface Demo2{
	public int add(int n1,int n2);
}
public class Object_reference {
	 public int square(int n) {
	        return n * n;
	  }
	 public int add(int n1,int n2) {
		 return n1+n2;
	 }
	public static void main(String[] args) {
        Object_reference obj = new Object_reference();
        Demo d = (n) -> obj.square(n);
        System.out.println(d.square(2));
        Demo d1=obj::square;
        System.out.println(d1.square(4));

		Function<Integer, Integer> f1=(n)-> obj.square(n);
		System.out.println(f1.apply(2));
		Function<Integer, Integer> f2= obj::square;
		System.out.println(f2.apply(4));
        
		Demo2 d2=(n1,n2)->obj.add(n1, n2);
		System.out.println(d2.add(5,6));
		Demo2 d3=obj::add;
		System.out.println(d3.add(5,6));
		
	}


}
