package Week2.strings;

public class basicString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
       String str1="hello";
       String str2="hello";
       String str3 = new String("hello");
       
//       System.out.println(str1.hashCode());
//       System.out.println(System.identityHashCode(str2));
//       System.out.println(System.identityHashCode(str3));
       
//       str3="hi";
//       System.out.println(System.identityHashCode(str3));
//       str3="hello"; //same block
       
       if (str1==str2) {
		System.out.println("Same block");
	} else {
		System.out.println("Not same block");
	}
       if (str1==str3) {
    	   System.out.println("Same block");
	} else {
		System.out.println("Not same block");
	}
       if (str3==(str3="hi")) {
    	   System.out.println("Same block");
	} else {
		System.out.println("Not same block");
	}
	}

}
