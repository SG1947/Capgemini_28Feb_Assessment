package Week2.hasa.bi;

public class Driver {
      public static void main(String[] args) {
		Engine e=new Engine();//engine created
		Car c= new Car();//car created
		
		// establishing bi-directional HAS-A relationship
		c.engine=e;//engine assigned to car

		System.out.println(c.col);
		System.out.println(c.engine);
		System.out.println(c.engine.noOfCylinders);
		
		e.car=c;//car assigned to engine
		
		System.out.println(e.noOfCylinders);
		System.out.println(e.car);
		System.out.println(e.car.col);
		
		System.out.println(c.engine.car.col);
	}
}
