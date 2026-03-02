package DSA.Day4;

import java.util.PriorityQueue;

public class KthSmallest {
	public static int kthSmallest(int[] arr, int k) {
		 
        // Min Heap (default behavior)
        PriorityQueue<Integer> pq = new PriorityQueue<>();
 
        // Step 1: Insert all elements into heap
        for (int num : arr) {
            pq.add(num);
        }
 
        // Step 2: Remove smallest element k times
        int ans = -1;
        for (int i = 0; i < k; i++) {
            ans = pq.poll();
        }
 
        return ans;
    }
 
    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 20, 15};
        int k = 3;
 
        System.out.println(kthSmallest(arr, k));
    }
    
    
}
