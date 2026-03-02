package Advanced_Java;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class forEach {

	public static void main(String[] args) {
		List<Integer>l=Arrays.asList(10,20,30);
//		for (int i = 0; i < l.size(); i++) {
//			System.out.println(l.get(i));
//		}
//		for(int a :l) {
//			System.out.println(a);
//		}
		
		Consumer<Integer>c=new Consumer<>() {
			
			@Override
			public void accept(Integer t) {
				System.out.println(t);
				
			}
		};
		l.forEach(c);
		
        Consumer<Integer>c1=(t)-> System.out.println(t);
        l.forEach(c1);
       
		l.forEach(n->System.out.println(n));
		l.forEach(System.out::println);
		
		

	}

}
