package Advanced_Java;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {
public static void main(String[] args) {
	List<Integer>l=Arrays.asList(100,20,30);
	Stream<Integer>s=l.stream().filter(n->n>20);
	Stream<Integer>s1=l.stream().sorted();
	s.forEach(System.out::println);
	s1.forEach(System.out::println);
	
	
	l.stream().filter(n->n%2==0).sorted().forEach(System.out::println);
	l.stream().filter(n->n%2==0).sorted(Comparator.reverseOrder()).forEach(System.out::println);
	System.out.println(l.stream().count());
	
	l.stream().map(n->n+10).forEach(System.out::println);
	
	Set<Integer> collect = l.stream().collect(Collectors.toSet());
	collect.forEach(System.out::println);
	
	System.out.println(l.stream().reduce(0,(a,b)->a+b));

	//once used can't be reutilised ,once consumed can't be used again,
	//it does not affect the main list
//	s.forEach(System.out::println);
}
}
