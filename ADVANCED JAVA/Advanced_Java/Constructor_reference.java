package Advanced_Java;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Function;


public class Constructor_reference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> employee=new ArrayList<>();
		employee.add("C");
		employee.add("A");
		employee.add("B");
		employee.add("A");
		
		Function<List<String>, Set<String>> f =(employeeList)->new HashSet<>(employeeList);
		System.out.println(f.apply(employee));
		Function<List<String>, Set<String>> f1 =HashSet::new;
		System.out.println(f1.apply(employee));
		
		List<String> student=new LinkedList<>();
		student.add("C");
		student.add("A");
		student.add("B");
		student.add("A");
		
		Function<List<String>,Set<String>> f2=(studentList)->new TreeSet<>(studentList);
		System.out.println(f2.apply(student));
		Function<List<String>,Set<String>> f3=TreeSet::new;
		System.out.println(f3.apply(student));

	}

}
