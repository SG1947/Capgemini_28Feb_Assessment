package Week2;

public class mix {
    static int i=stat(); //we are calling the static method 
//  static int a= new mix().nonstat();
    int j=nonstat();

    static {
    	System.out.println("from static block");
    }
 
    {
    	System.out.println("from non-static block");
    }
    
    public mix() {
    	System.out.println("From constructor");
    }
    
    public static int stat() {
    	System.out.println("From static method");
    	return 0;
    }
    public int nonstat() {
//    	System.out.println(i);
//	System.out.println(j);
    	System.out.println("From non-static method");
    	return 7;
    }
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(i);
		
//		System.out.println(st.j);
		System.out.println("Start of main()");
		mix st = new mix();
		mix st1 = new mix();
		System.out.println("End of main()");
	}

}
