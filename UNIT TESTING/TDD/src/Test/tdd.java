package Test;

public class tdd {
   public String rev(String str) {
//	   return null;
	   String result="";
	   for(int i=str.length()-1;i>=0;i--) {
		   result+=str.charAt(i);
	   }
	   return result;
   }
}
