package Week2.arrays;

public class methodArray {

	public static void main(String[] args) {
		boolean [] boolArr= {true,false,true};
		char [] charArr= {'a','b','c'};
		char [] charArr1= {'a','b','c'};
		char [] charArr2= charArr1;
	    Object [] objArr= {1234L,"string",'d'};
	    
//	    System.out.println(charArr.hashCode());
//	    System.out.println(charArr1.hashCode());
//	    System.out.println(charArr2.hashCode());   
//	    
//	    System.out.println(boolArr);
//	    System.out.println(charArr);
//	    System.out.println(objArr);

//	    arrayPrinter(objArr);
//      arrayPrinter(charArr);
	    arrayPrinter(boolArr,charArr);
	    boolean b=true;
	    char c='a';
	    String str="hello";
	    
//	    singleValue(b);
//	    singleValue(c);
//	    singleValue(str);
	}
//	public static void arrayPrinter(Object [] arr) {
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
//	}
	


public static void arrayPrinter(Object ... arr) {

	        for (Object o : arr) {

	            if (o instanceof boolean[]) {
	                for (boolean b : (boolean[]) o)
	                    System.out.print(b + " ");
	            }
	            else if (o instanceof char[]) {
	                for (char c : (char[]) o)
	                    System.out.print(c + " ");
	            }
	            else if (o instanceof Object[]) {
	                for (Object x : (Object[]) o)
	                    System.out.print(x + " ");
	            }

	            System.out.println(); // next array
	        }
 }


	public static void singleValue(Object var) {
		System.out.println(var);
	}

}


//public static void arrayPrinter(Object arr) {
//
//    if (arr instanceof boolean[]) {
//        for (boolean b : (boolean[]) arr)
//            System.out.print(b + " ");
//    }
//    else if (arr instanceof char[]) {
//        for (char c : (char[]) arr)
//            System.out.print(c + " ");
//    }
//    else if (arr instanceof Object[]) {
//        for (Object o : (Object[]) arr)
//            System.out.print(o + " ");
//    }
//
//    System.out.println();
//}
//
