package newprog;

public class Factmethod {
	public static int i;
	public int j;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static String whatIsIt(char ch) {
		String rtn=null;
		System.out.println(i);
		
		Factmethod ft=new Factmethod();
		System.out.println(ft.j);
		
		System.out.println(rtn);
		
		if(ch>='a' && ch<='z') {
			rtn="LCA";
//			return rtn;
		}
		else if(ch>='A' && ch<='Z') {
			rtn="UCA";
//			return rtn;
		}
		else if(ch>='0' && ch<='9') {
			rtn="Num";
		}
		else {
			rtn="SC";
		}
		return rtn;
	}
	public void name() {
		System.out.println(i);
		System.out.println(j);
		nextInt();// not in our class , so first create object of Scanner class 
	}
}
