import java.util.Objects;
enum Days{
	MONDAY,TUESDAY,WEDNESDAY
};
class InvalididException extends Exception{
	public InvalididException(String message) {
		super(message);
	}
}
class InvalidNameException extends RuntimeException{
	public InvalidNameException(String message) {
		super(message);
	}
}
interface New{
	abstract void display();
}
abstract class Demo implements New{
	public void display() {
		System.out.println("Hello");
	}
}
class Parent extends Demo{
	private int id;
	String name;
	public void setid(int id) {
		this.id=id;
	}
	public int getid() {
		return this.id;
	}
	Parent(int id,String name){
		this.id=id;
		this.name=name;
	}
	Parent(){
		
	}
	public String toString() {
		return "Id:"+this.id+" Name:"+this.name;
	}
	public int hashCode() {
		return Objects.hash(id,name);
	}
	public boolean equals(Object obj) {
	    if(this==obj) return true;
	    if(obj==null||obj.getClass()!=this.getClass()) return false;
	    Parent p=(Parent)obj;
	    if(p.id==this.id && Objects.equals(p.name,this.name)) return true;
	    return false;
	}
	public void modifyId(int newid) throws InvalididException{
		if(newid<0) throw new InvalididException("Id should be greater than 0");
		this.id=newid;
	}
	public void modifyName(String newname) {
		if(newname==null) throw new InvalidNameException("Name should not be null");
		this.name=newname;
	}
	
}
class Child extends Parent{
	Child(int id, String name){
	    super(id, name);
	}
	@Override
	public void modifyName(String newname) {
		if(newname.equals("ABC")) throw new InvalidNameException("Name should not be ABC");
		this.name=newname;
	}
	
	public void modifyName(String newname,String msg) {
		if(newname.equals("ABC")) throw new InvalidNameException("Name should not be ABC");
		this.name=newname;
		System.out.println("Successful"+msg);
	}
	
}
public class Core {

	public static void main(String[] args) {

	    // ---- Using Parameterized Constructor ----
	    Parent p1 = new Parent(1, "John");
	    Parent p2 = new Parent(1, "John");

	    // ---- Using Default Constructor ----
	    Parent p3 = new Parent();
	    p3.setid(10);
	    p3.modifyName("DefaultUser");
	    System.out.println("Default Constructor Object: " + p3);

	    // ---- toString ----
	    System.out.println("toString(): " + p1);

	    // ---- equals & hashCode ----
	    System.out.println("equals(): " + p1.equals(p2));
	    System.out.println("HashCodes equal: " + (p1.hashCode() == p2.hashCode()));

	    // ---- Calling display() (Abstraction Demo) ----
	    p1.display();   // inherited from Demo (abstract class implementation)

	    // ---- Checked Exception ----
	    try {
	        p1.modifyId(-10);
	    } catch (InvalididException e) {
	        System.out.println("Checked Exception: " + e.getMessage());
	    }

	    // ---- Unchecked Exception (NULL will trigger it) ----
	    try {
	        p1.modifyName(null);   // This WILL trigger exception
	    } catch (InvalidNameException e) {
	        System.out.println("Unchecked Exception: " + e.getMessage());
	    }

	    // ---- Runtime Polymorphism ----
	    Parent obj = new Child(2, "Mike");
	    obj.modifyName("David");
	    System.out.println("Polymorphism Object: " + obj);

	    // ---- Method Overloading ----
	    Child c = new Child(3, "Tom");
	    c.modifyName("Harry", " Updated!");
	    Days days=Days.MONDAY;
	    Days days1=Days.TUESDAY;
	    System.out.println(days);
	    System.out.println(days1.ordinal());
	    System.out.println(days.name().compareTo(days1.name()));
	    for(Days d:Days.values()) {
	    System.out.println(d);
	    }
	    
	}
	

}


//studentList.sort((a,b)->{
//    int cgpacomp=Double.compare(b.getCgpa(), a.getCgpa());
//    if(cgpacomp!=0) return cgpacomp;
//    int namecomp=a.getFname().compareTo(b.getFname());
//    return namecomp;
//});