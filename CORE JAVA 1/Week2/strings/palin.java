package Week2.strings;

public class palin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="racecar";
       if(comp(str)) System.out.println("Palindrome");
       else System.out.println("Not Palindrome");
	}
	public static boolean comp(String str) {
		int l=0;
	       int r=str.length()-1;
	       while(l<=r) {
	    	   if(str.charAt(l)!=str.charAt(r)) return false;
	    	   l++;
	    	   r--;
	       }
		return true;
	}

}
