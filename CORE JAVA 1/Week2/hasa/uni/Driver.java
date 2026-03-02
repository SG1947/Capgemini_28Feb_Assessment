package Week2.hasa.uni;

public class Driver {
      public static void main(String[] args) {
		Engine e=new Engine();
		System.out.println(e.noOfCylinders);
//		System.out.println(e.col);
		Car c= new Car();
		
		c.engine=e;
		System.out.println(c.col);
		System.out.println(c.engine);
		System.out.println(c.engine.noOfCylinders);
	}
}
