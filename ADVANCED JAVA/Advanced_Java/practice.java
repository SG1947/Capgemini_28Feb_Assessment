package Advanced_Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;

interface Test{
	public int print(String s);
//	public int printing(String s);
}
public class practice {
    public static int printing(String t) {
    	return t.length();
    }
    public int print(String t) {
    	return t.length()+100;
    }
	public static void main(String[] args) {
//      Test t=(String s)->s.length();
//      System.out.println(t.printing("Hello"));
//      
//      Test t1=(String s)->practice.printing(s);
//      System.out.println(t1.printing("Hello"));
//      
//      Test t2=practice::printing;
//      System.out.println(t2.printing("Hello"));
      
      practice prac=new practice();
      Test t3=(String s)->prac.print(s);
      System.out.println(t3.print("Hello"));
      
      Function<String,Integer>f1=(String str)->prac.print(str);
      System.out.println(f1.apply("W"));
      Test t4=prac::print;
      System.out.println(t4.print("Hello"));
      
      
      List<Integer>arr=new ArrayList<Integer>();
      arr.add(1);
      arr.add(2);
      Function<List<Integer>,Set<Integer>>f=(listarray)->new HashSet<>(listarray);
      System.out.println(f.apply(arr));
      List<Integer>l=Arrays.asList(10,20,30);
      l.stream().sorted(Comparator.reverseOrder()).filter(n->n>10).map(n->n+10).collect(Collectors.toSet()).forEach(System.out::println);
	}
//multiple inheritance , since 
}
