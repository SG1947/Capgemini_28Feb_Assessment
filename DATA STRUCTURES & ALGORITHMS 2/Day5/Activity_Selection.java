package DSA.Day5;

import java.util.Arrays;
import java.util.Comparator;

class Activitycomparator implements Comparator<int []>{

	@Override
	public int compare(int[] a, int[] b) {
		if(a[1]>b[1]) return 1;
		else if( a[1]<b[1]) return -1;
		return 0;
	}
	
}
public class Activity_Selection {
public static int activitySelection(int [] start, int [] finish) {
	int count=1;
	int n=start.length;
	int [][]arr=new int[n][2];
	for (int i = 0; i < n; i++) {
		arr[i][0]=start[i];
		arr[i][1]=finish[i];
	}
	Arrays.sort(arr,new Activitycomparator());
	
//	// Sort activities by finish time
//    Arrays.sort(arr, Comparator.comparingInt(a -> a[1]));
	
    int j = 0;

    for (int i = 1; i < n; i++) {
        if (arr[i][0] > arr[j][1]) {
            count++;
            j = i;
        }
    }

	return count;
}
public static void main(String[] args) {
	int[] start = {5, 1, 8, 0, 3, 5};
    int[] finish = {9, 2, 9, 6, 4, 7};
    System.out.println(activitySelection(start, finish));
}
}



//public class Batch_1 {
//	 
//    public static int activitySelection(int[] start, int[] finish) {
// 
//        int n = start.length;
//        for (int i = 0; i < n - 1; i++) {
//            int min = i;
//            for (int j = i + 1; j < n; j++) {
//                if (finish[j] < finish[min]) {
//                    min = j;
//                }
//            }
//            int temp = finish[i];
//            finish[i] = finish[min];
//            finish[min] = temp;
//            temp = start[i];
//            start[i] = start[min];
//            start[min] = temp;
//        }
//        int count = 1;
//        int lastFinish = finish[0];
// 
//        for (int i = 1; i < n; i++) {
//            if (start[i] > lastFinish) {
//                count++;
//                lastFinish = finish[i];
//            }
//        }
// 
//        return count;
//    }
// 
//    public static void main(String[] args) {
//        int[] start = {1, 3, 0, 5, 8, 5};
//        int[] finish = {2, 4, 6, 7, 9, 9};
//        System.out.println(activitySelection(start, finish));
//    }
//}
