//https://www.codechef.com/practice/course/stacks-and-queues/STAQUEF/problems/STONE_PILE
package DSA.one;

import java.util.*;

public class StonePile {
   public static void stonepile(int [] arr) {
	   int N=arr.length;
	   Queue<Integer>q=new LinkedList<>();
	      for(int i=0;i<N;i++){
	          q.offer(arr[i]);
	      }
	      int currplayer=1;
	      int lastplayer=1;
	      while(q.size()>1) {
	    	  if(currplayer==1) {
	    		  q.offer(q.poll());
	    		  q.poll();
	    		  lastplayer=currplayer;
	    		  currplayer=0;
	    	  }
	    	  else {
	    		  q.offer(q.poll());
	    		  q.offer(q.poll());
	    		  q.poll();
	    		  lastplayer=currplayer;
	    		  currplayer=1;
	    	  }
	      }
	      System.out.println("CurrentPlayer :"+lastplayer+ " Remaining:" + q.poll());
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int [] arr= {-1,-3,2,4};
     int [] arr1= {-100000, 0 ,0 ,100000 ,-1000000 ,1000000};
     stonepile(arr1);
	}

}
