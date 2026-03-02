package DSA;

import java.util.Arrays;
import java.util.Collections;

public class Compare {

	public static void main(String[] args) {
		int[] numbers = {5, 2, 9, 1, 3};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        
        
        int[] arr = {5, 2, 9, 1, 3};
        Integer[] boxed = new Integer[arr.length];
        for (int i = 0; i < arr.length; i++) {
            boxed[i] = arr[i]; 
        }
        Arrays.sort(boxed, Collections.reverseOrder());
        System.out.println(Arrays.toString(boxed));

        
        String[] names = {"Zara", "Alex", "John"};
        Arrays.sort(names);
        

//        int[] numbers = {5, 2, 9, 1, 3};
//
//        Arrays.sort(numbers);
//
//        for (int i = 0; i < numbers.length / 2; i++) {
//            int temp = numbers[i];
//            numbers[i] = numbers[numbers.length - 1 - i];
//            numbers[numbers.length - 1 - i] = temp;
//        }
//
//        System.out.println(Arrays.toString(numbers));

	}

}
