package DSA.Day5;

public class PrimsAlgo {

	public static void main(String[] args) {
		int N=5;
		int[][] cost = {
	            {0, 1, 0, 4, 0},
	            {2, 0, 5, 8, 5},
	            {0, 8, 0, 0, 7},
	            {9, 8, 0, 0, 9},
	            {0, 4, 7, 9, 0}
	        };
       boolean [] visited = new boolean[N];
       int total=0;
       int edges=0;
       visited[0]=true;
       while(edges<N-1) {
    	   int min=Integer.MAX_VALUE;
	   int x=-1,y=-1;
    	   for (int i = 0; i < N; i++) {
			if(visited[i]) {
				for (int j = 0; j < N; j++) {
					if(!visited[j] && cost[i][j]!=0 && cost[i][j]<min) {
						x=i;
						y=j;
						min=cost[i][j];
					}
				}
			}
		}
    	   edges++;
    	   total+=min;
    	   visited[y]=true;
    	   System.out.println(x +"->"+y + " Cost:"+min);
       }
       System.out.println("Total Cost:"+total);
	}

}
