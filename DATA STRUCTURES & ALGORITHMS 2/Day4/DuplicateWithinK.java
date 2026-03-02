package DSA.Day4;

import java.util.HashSet;

public class DuplicateWithinK {
	static boolean hasDuplicate(int[] arr, int k) {
		 
        HashSet<Integer> set = new HashSet<>();
 
        for (int i = 0; i < arr.length; i++) {
 
            // If element already exists in set
            if (set.contains(arr[i])) {
                return true;   // duplicate within k distance found
            }
 
            // Add current element to the set
            set.add(arr[i]);
 
            // Maintain window size of k
            if (set.size() > k) {
                set.remove(arr[i - k]);
            }
        }
 
        return false;  // no duplicate within k distance
    }
 
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 4, 5};
        int k = 3;
 
        System.out.println(hasDuplicate(arr, k));
    }
}
