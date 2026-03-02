package DSA.one;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Defectivebulb {

    public static int firstDefected(char[] arr) {

        int low = 0;
        int high = arr.length - 1;
        int result = -1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (arr[mid] == 'F') {
                result = mid;
                high = mid - 1;  // search left
            } else {
                low = mid + 1;   // move right
            }
        }

        return result;
    }

    public static void main(String[] args) {

        char[] ch = {'P','P','P','P','F','F','F'};
        System.out.println("First Defected bulb is at index: " + firstDefected(ch));
//        Queue<Integer>q=new LinkedList<Integer>();
//        q.offer(12);
//        q.offer(13);
//        q.offer(123);
//        q.offer(128);
//        System.out.println(q.poll());
//        System.out.println(q.peek());
//       HashMap<Integer, Integer>hs=new HashMap<>();
//       System.out.println(hs.put(1, 3));
//       System.out.println(hs.get(1));
//       System.out.println(hs.put(2, hs.getOrDefault(hs, 0)+1));
       PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
       pq.offer(10);
       pq.offer(13);
       pq.offer(15);
       pq.offer(12);
       pq.offer(11);
       while(!pq.isEmpty()) {
    	   System.out.println(pq.poll());
       }
//       Iterator it=pq.iterator();
//       while(it.hasNext()) {
//    	   System.out.println(it.next());
//       }
//	
       //why comparator is functional interface although more than one abstract method
       
    }
}


