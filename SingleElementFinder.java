package DSA;

public class SingleElementFinder {
    public static int singleNonDuplicate(int[] nums) {
        int low = 0, high = nums.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            // Check if mid is paired correctly
            if (mid % 2 == 0) {
                if (nums[mid] == nums[mid + 1]) {
                    low = mid + 2; // Move to the right half
                } else {
                    high = mid; // Move to the left half
                }
            } else {
                if (nums[mid] == nums[mid - 1]) {
                    low = mid + 1; // Move to the right half
                } else {
                    high = mid; // Move to the left half
                }
            }
        }

        // Low will point to the single element
        return nums[low];
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 1, 2, 3, 3, 4, 4, 8, 8};
        int[] nums2 = {3, 3, 7, 7, 10, 11, 11};

        System.out.println("Single element in nums1: " + singleNonDuplicate(nums1)); // Output: 2
        System.out.println("Single element in nums2: " + singleNonDuplicate(nums2)); // Output: 10
    }
}
