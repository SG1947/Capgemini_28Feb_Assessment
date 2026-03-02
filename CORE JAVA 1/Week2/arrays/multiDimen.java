package Week2.arrays;

public class multiDimen {

	public static void main(String[] args) {
//		int [][]arr=new int[0][0];
//		System.out.println(arr); //[[I@65b3120a
		int [][] arr=new int[2][2];
		int [][] arr1= {{1,2},{3,4,5},{6}};
		int [][] arr2= {{1,2,0},{3,4,5},{6,0,0}}; 
		countEle(arr1);
	}
	public static void countEle(int [][]arr) {
//		int num=arr.length * arr[0].length;
//		System.out.println("Total elements: "+ num);
		int count=0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[2][1]=8;
				arr[0][2]=9;
//				System.out.println(arr[i][j]);
				count++;
			}
		}
		System.out.println(count);
	}

}
