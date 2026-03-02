package DSA.Day4;

public class MaxBitonic {
	public static int findMaximum(int[] arr) {
        int low = 0;
        int high = arr.length - 1;
 
        while (low < high) {
            int mid = low + (high - low) / 2;
 
            if (arr[mid] < arr[mid + 1]) {
                // increasing part
                low = mid + 1;
            } else {
                // decreasing part
                high = mid;
            }
        }
 
        return arr[low]; // or arr[high]
    }
 
    public static void main(String[] args) {
        int[] arr = {1, 3, 8, 12, 9, 5, 2};
        System.out.println(findMaximum(arr));
    }
}
