package Week2;

public class nonStatic {
   int i=7;
   {
	   System.out.println("from non static block");
   }
   public void nonstat() {
   System.out.println("method non static");
}
   public nonStatic() {
	   System.out.println("from constructor");
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Start of main()");
		nonStatic st = new nonStatic();
		System.out.println("End of main()");
	}

}
