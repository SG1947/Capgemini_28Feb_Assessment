package Week2.objects;

public class UserDriver {

	public static void main(String[] args) {
		
		User c1 = new User("hello@gmail.com","12345");
		System.out.println(c1.email);
		System.out.println(c1.password);
		System.out.println(c1.address); 
		
		User c2 = new User("gello@gmail.com","98765","Kolkata");
		System.out.println(c2.email);
		System.out.println(c2.password);
		System.out.println(c2.address);

	}

}
