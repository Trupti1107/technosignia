package DSA;

import java.util.ArrayList;
import java.util.Collections;

public class LargetNumberK {
	 // Function to partition the array around a pivot
    static int partition(int[] arr, int left, int right) {
        
        // Last element is chosen as a pivot.
        int pivot = arr[right];
        int i = left;

        for (int j = left; j < right; j++) {
          
          	// Elements greater than or equal to pivot
      		// are placed in the left side of pivot
            if (arr[j] >= pivot) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
        }
        
        int temp = arr[i];
        arr[i] = arr[right];
        arr[right] = temp;
        
        // The correct sorted position of the pivot
        return i;
    }

    static void quickSelect(int[] arr, int left, int right, int k) {
        if (left <= right) {
            int pivotIdx = partition(arr, left, right);
            
            // Count of all elements in the left part
            int leftCnt = pivotIdx - left + 1;
          
            // If leftCnt is equal to k, then we have
      		// found the k largest element
            if (leftCnt == k) 
                return;
            
            // Search in the left subarray
            if (leftCnt > k)
                quickSelect(arr, left, pivotIdx - 1, k);
                
            // Reduce the k by number of elements already covered
            // and search in the right subarray
            else 
                quickSelect(arr, pivotIdx + 1, right, k - leftCnt);
        }
    }

    static ArrayList<Integer> kLargest(int[] arr, int k) {
        quickSelect(arr, 0, arr.length - 1, k);
        ArrayList<Integer> res = new ArrayList<>();
      
        // First k elements of the array, will be the largest
      	for(int i = 0; i < k; i++)
          	res.add(arr[i]);
      
      	// Sort the result in descending order
      	Collections.sort(res, Collections.reverseOrder());
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {1, 23, 12, 9, 30, 2, 50};
        int k = 3;

        ArrayList<Integer> res = kLargest(arr, k);
        for (int ele : res)
            System.out.print(ele + " ");
    }

}
