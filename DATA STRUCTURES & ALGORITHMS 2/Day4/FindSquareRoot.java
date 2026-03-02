package DSA.Day4;

public class FindSquareRoot {
	static int findSquareRoot(int n) {
		 
        int low = 0, high = n;
        int ans = 0;
 
        while (low <= high) {
 
            int mid = low + (high - low) / 2;
            long square = (long) mid * mid;
 
            if (square == n) {
                return mid;
            }
            else if (square < n) {
                ans = mid;
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return ans;
    }
 
 
 

 
    public static void main(String[] args) {
 
        int n = 20;
        System.out.println(findSquareRoot(n));
    }
}
