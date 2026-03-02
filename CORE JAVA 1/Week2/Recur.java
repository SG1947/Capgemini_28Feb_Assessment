package Week2;

public class Recur {

	public static void main(String[] args) {
		starPrinter(5);

	}
	///ending condition
//	public static void starPrinter(int count) {
//		System.out.println("*");
//		if (--count==0) {
//			return;
//		}
//		starPrinter(count);
//		
//		
//	}
	///continuing condition
	public static void starPrinter(int count) {
		System.out.println("*");
		if (--count>0) {
			starPrinter(count);
		}
		return;
		
		
	}

}
