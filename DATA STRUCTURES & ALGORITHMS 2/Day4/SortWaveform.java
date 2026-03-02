package DSA.Day4;

import java.util.Arrays;

public class SortWaveform {
	public static void waveSort(int[] arr) {
		 
        // Step 1: Sort the array
        Arrays.sort(arr);
 
        // Step 2: Swap alternate elements
        for (int i = 0; i < arr.length - 1; i += 2) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
    }
 
    public static void main(String[] args) {
        int[] arr = {3, 6, 5, 10, 7, 20};
 
        waveSort(arr);
 
        System.out.println(Arrays.toString(arr));
    }
}
