//https://www.codechef.com/practice/course/stacks-and-queues/STAQUEP/problems/STKSORTpackage DSA.one;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class StackSort {
    public static boolean stacksort(int [] A) {
//        int n=A.length;
//    	    int [] B= new int[n];
//    	    int idx=0;
//		Stack<Integer>st=new Stack<>();
//		st.push(A[0]);
//		for(int i=1;i<n;i++) {
//			if(A[i]<st.peek()) {
//				st.push(A[i]);
//			}
//			else {
//			while(st.peek()<A[i]) {
//				B[idx]=st.pop();
//				idx++;
//			}
//			st.push(A[i]);
//			}
//		}
//		  while(!st.isEmpty()) {
//			  B[idx++]=st.pop();
//		  }
//		  System.out.println(B[0]);
//		  System.out.println(B[1]);
//		  System.out.println(B[2]);
//		  System.out.println(B[3]);
//		  Arrays.sort(A);
//		  
//		  for(int i=0;i<n;i++) {
//			  if(A[i]==B[i]) return true;
//		  }
//		  return false;
       	int n = A.length;
        int count = 1;
        int [] B = new int[n];
        int idx = 0;
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < n; i++) {
            st.push(A[i]);

            while(!st.isEmpty() && st.peek() == count) {
                B[idx++] = st.pop();
                count++;
            }
        }

//        while(!st.isEmpty()) {
//            B[idx++] = st.pop();
//        }

        Arrays.sort(A);
        for(int i = 0; i < n; i++) {
            if(A[i] != B[i])
                return false;
        }

        return true;
	}
	public static void main(String[] args) {
		int [] A= {4,1,3,2};
		if(stacksort(A)) System.out.println("TRUE");
		else System.out.println("FALSE");
		
	}

}
