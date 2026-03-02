package Week2.strings;

public class validateEmail {
	static String email ="sg.at.work23@gmail.com";
	public static void main(String[] args) {
      if(validate(email)) 
    	  System.out.println("Valid email address");
      else
    	  System.out.println("Invalid email address");
	}
    public static boolean validate(String email) {
    	    if(!(email.contains("@"))) {
    	    	     return false;
    	    }
    	    if(email.indexOf("@")!= email.lastIndexOf("@")) return false;
//    	    for (int i = 0; i < email.length(); i++) {
//				if(email.charAt(i)=='@') count++;
//				if(count!=1) return false;
//		}
    	    if(!(email.endsWith("gmail.com")||email.endsWith("yahoo.in") ) )return false;
		return true;
	}
}
