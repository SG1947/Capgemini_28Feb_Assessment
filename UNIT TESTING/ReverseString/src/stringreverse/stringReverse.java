package stringreverse;

public class stringReverse {
	
     public String reverse(String str) {
    	 StringBuilder sb=new StringBuilder(str);
    	 return sb.reverse().toString();
     }
     
     public int add(int a,int b) {
    	 return a+b;
     }
     
     public boolean check(int x) {
    	 return x%2==0?true:false;
     }
     public int[] odd(int [] arr) {
    	 return arr;
     }
}
