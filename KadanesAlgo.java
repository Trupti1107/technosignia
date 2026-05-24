package DSA;

public class KadanesAlgo {

	
		  static int maxSubarraySum(int[] arr) {
		        
		        // Stores the result (maximum sum found so far)
		        int res = arr[0];
		        
		        // Maximum sum of subarray ending at current position
		        int maxEnding = arr[0];

		        for (int i = 1; i < arr.length; i++) {
		            
		            // Either extend the previous subarray or start 
		            // new from current element
		            maxEnding = Math.max(maxEnding + arr[i], arr[i]);
		          
		            // Update result if the new subarray sum is larger
		            res = Math.max(res, maxEnding);
		        }
		        return res;
		    }
		  
	public static void main(String[] args) {
		int[] a = { 3, -4, 5, 4, -1, 7, -8 };
			System.out.println(maxSubarraySum(a));
	}
}
