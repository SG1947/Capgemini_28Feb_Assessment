package Advanced_Java;
class DemoSync implements Runnable{
	int count=0;
	   synchronized void show() { // one thread can access at a time
		   count++;
	   }
		@Override
		public void run() {
			for (int i = 0; i < 500; i++) {
				show();
			}	
		}
}
public class Sync {

	public static void main(String[] args) {
		DemoSync d=new DemoSync();
	     Thread t1=new Thread(d);
	     Thread t2=new Thread(d);
	     t1.start();
	     t2.start();
	     try {
			t1.join(); // to stop the thread
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	     System.out.println(d.count);

	}

}
