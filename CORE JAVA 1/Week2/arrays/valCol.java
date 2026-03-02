package Week2.arrays;

public class valCol {

	public static void main(String[] args) {
      int [][]arr=null;
      int [][]arr1= {{1},{3},{4}};
      try {
      if(checklColMat(arr)) System.out.println("Column matrix");
      else {System.out.println("Not a Column matrix");}
      }
      catch (Exception e) {
		System.out.println(e.getMessage());
	}{
    	  
      }
      
	}
	public static boolean checklColMat(int [][]arr) {
		for (int i = 0; i < arr.length; i++) {
				if(arr[i].length!=1 ) return false;
			
		}
		return true;
	}

}
