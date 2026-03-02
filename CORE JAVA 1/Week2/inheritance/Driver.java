package Week2.inheritance;

public class Driver {
    public static void main(String[] args) {
		Parent p=new Parent();
		System.out.println(p.a);
//		System.out.println(p.b);
		
		Child c=new Child();
		System.out.println(c.a);
		System.out.println(c.b);
	}
}
