package DSA.one;

import java.util.*;

public class Student implements Comparable<Student>{
	private String name;
	private int rollNumber;
	public Student() {
		
	}
	public Student(String name, int rollNumber) {
		super();
		this.name = name;
		this.rollNumber = rollNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	@Override
	public int hashCode() {
		return Objects.hash(name, rollNumber);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass() )
			return false;
		Student other = (Student) obj;
		return Objects.equals(name, other.name) && rollNumber == other.rollNumber;
	}
	@Override
	public String toString() {
		return "Demo [name=" + name + ", rollNumber=" + rollNumber + "]";
	}
	
	@Override
	public int compareTo(Student o) {
		
		return this.getRollNumber()-o.getRollNumber();
	}
	//without comparable implementation we get class cast exception as the comparable is 
	//expecting object doesn't know what the user gives , type casting is done in the Arrays.sort()
	// as our object is not same as Comparable reference
	//in comparator we can define custom ordering as per our need 
	
}


class NameComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.getName().compareTo(s2.getName());
    }
}


