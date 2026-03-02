package Week2;

public class staticfinal {
    static final int i=0;
    static int j=printer();
    static{
	System.out.println("from static1");
}
	public static void main(String[] args) {
		
		System.out.println("Start of main()");
		System.out.println("End of main()");

//		i++;
//      System.out.println(i);

	}
	public static int printer(){
		System.out.println("Printed");
		return 0;
	}
	
static{
	System.out.println("from static2");
}



}