package DSA.Day4;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthLargest {
	  public static int kthLargest(int[] arr, int k) {
		  
	        // Max Heap
	        PriorityQueue<Integer> pq =
	                new PriorityQueue<>(Collections.reverseOrder());
	 
	        // Insert all elements into heap
	        for (int num : arr) {
	            pq.add(num);
	        }
	 
	        // Remove largest element k times
	        int ans = -1;
	        for (int i = 0; i < k; i++) {
	            ans = pq.poll();
	        }
	 
	        return ans;
	    }
	 
	    public static void main(String[] args) {
	        int[] arr = {7, 10, 4, 3, 20, 15};
	        int k = 2;
	 
	        System.out.println(kthLargest(arr, k));
	    }
}
