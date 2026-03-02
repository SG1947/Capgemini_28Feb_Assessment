package Advanced_Java;

import java.util.function.Function;

@FunctionalInterface
interface Draw{
	void circle();
}
//class c1 implements Draw{
//
//	@Override
//	public void circle() {
//		System.out.println("Circle c1");
//		
//	}
//	
//}
//class c2 implements Draw{
//
//	@Override
//	public void circle() {
//		System.out.println("Circle c2");
//		
//	}
//	
//}
//class Demo implements Function<String, Integer>{
//
//	@Override
//	public Integer apply(String t) {
//		return t.length();
//	}
//	
//}
public class Main {
	public static void main(String[] args) {
//		Draw s= new c1();
//		s.circle();
//		Draw s1= new c2();
//		s1.circle();
//		
//		public void circle() {
//			System.out.println("Circle c1");
//			
//		}
		Draw demo=()->System.out.println("Hello");
		demo.circle();
		Function<String,Integer>f=(String s )->s.length();
		System.out.println(f.apply("Hello"));
		Draw d=()->System.out.println("Circle c1");
		d.circle();
		
		Draw d1=()->System.out.println("Circle c2");
		d1.circle();
		
		Draw d2=() ->{System.out.println("Circle c3");};
		d2.circle();
		
//		Demo abc=new Demo();
//		
//		int len =abc.apply("Hello");
//		System.out.println(len);
		Function<String,Integer> f =(String t) ->{
			return t.length();
		};
		System.out.println(f.apply("hello"));
		

	}	

}
