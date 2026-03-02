package DSA.one;

public class InsertProductID {
    public static void insertproduct(int [] arr , int target) {
    	int n=arr.length;
	int [] res= new int[n+1];
	for (int i = 0; i < n; i++) {
		res[i]=arr[i];
	}
	int low=0;
	int high=n-1;
	int ans=-1;
	while(low<=high) {
		int mid=low+(high-low)/2;
		if(arr[mid]<target) {
			ans=mid;
			low=mid+1;
		}
		else {
			high=mid-1;
		}
		
	}
	
	for (int i =res.length-1;i>ans+1;i--) {
		res[i]=res[i-1];
	}
	res[ans+1]=target;
    	for (int i = 0; i < res.length; i++) {
			System.out.println(res[i]);
		}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 
     int [] arr ={101, 105 ,110 ,120, 130};
     int target=107;
     insertproduct(arr, target);

}

}
