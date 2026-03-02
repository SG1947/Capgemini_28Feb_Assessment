package Week2.objects;

public class User {
     String email;
     String password;
     
	public User(String email, String password) {
		this.email = email;
		this.password = password;
	}
    String address;
    
	public User(String email, String password, String address) {
//		this.email = email;
//		this.password = password;
		this(email,password);//this call statement is used to call ctor within class , can be used only inside a ctor
		this.address = address;
	}



}
