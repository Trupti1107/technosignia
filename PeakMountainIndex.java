package DSA;

public class PeakMountainIndex {

	public static int peakIndexInMountainArray(int[] arr) {
		int sta = 0, end = arr.length - 1;
		while (sta < end) {
			int mid = sta + (end - sta) / 2;
			if (arr[mid + 1] > arr[mid]) {
				sta = mid + 1;  
			} else {
				end = mid;
			}
		}
		return end;
	}

	public static void main(String[] args) {

		int[] nums1 = { 0,10,5,2 };
		int[] nums2 = { 0, 3, 7, 9, 5, 4, 3 };

		System.out.println("Peak element in nums1: " + peakIndexInMountainArray(nums1)); // Output: 2
		System.out.println("Peak element in nums2: " + peakIndexInMountainArray(nums2)); // Output: 10
	}
}
