package DSA.one;

import java.util.Arrays;

public class Driver {

	public static void main(String[] args) {
     Student [] students= {
    		 new Student("ABC",12),
    		 new Student("C",13),
    		 new Student("AC",11)
    		 
     };
     Arrays.sort(students);
     for(Student student : students) {
    	 System.out.println(student);
     }
     Arrays.sort(students,new NameComparator());
     
     for(Student student : students) {
    	 System.out.println(student);
     }
     Arrays.sort(students,(Student a, Student b)->a.getRollNumber()-b.getRollNumber());
     Arrays.sort(students, (s1, s2) -> {

    	    int nameCompare = s1.getName().compareTo(s2.getName());

    	    if (nameCompare != 0) {
    	        return nameCompare;   // if names different, return result
    	    }
    	    return Integer.compare(s1.getRollNumber(), s2.getRollNumber());
    	});

     for(Student student : students) {
    	 System.out.println(student);
     }
	}

}
