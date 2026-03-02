package Week2.strings;

public class trimSpaces {

	public static void main(String[] args) {
      String str="   hello world ";
      String s=str.trim();
//      System.out.println(str);
//      System.out.println(s);
      
      int i=0;
      while(i<str.length() && str.charAt(i)==' ') {
    	        i++;
      }
      System.out.println(str.substring(i));
	}

}
