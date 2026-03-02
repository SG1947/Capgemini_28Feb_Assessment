package Advanced_Java;

import java.util.ArrayList;

@FunctionalInterface
interface SumCalculator {
    int sum(int a, int b);
}
public class Add {

	public static void main(String[] args) {
		SumCalculator sc =(int a, int b)->{return a+b;};
		int ans=sc.sum(4, 5);
		System.out.println(ans);
		 ArrayList<Integer> list = new ArrayList<>();
	        list.add(1);
	        list.add(2);
	        list.add(3);
	        list.add(4);

	        System.out.println("All elements:");
	        list.forEach((n)->{;
	            System.out.println(n);
	        });

	        System.out.println("Even elements:");
	        list.forEach(n -> {
	            if (n % 2 == 0)
	                System.out.println(n);
	        });
	        
	        list.forEach((n) -> {
	            boolean flag = true;

	            if (n <= 1) {
	                flag = false;
	            } else {
	                for (int i = 2; i <= Math.sqrt(n); i++) {
	                    if (n % i == 0) {
	                        flag = false;
	                        break;
	                    }
	                }
	            }

	            if (flag)
	                System.out.println(n + " is a prime number.");
	            else
	                System.out.println(n + " is not a prime number.");
	        });

}
}
