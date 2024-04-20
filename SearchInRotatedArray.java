public class SearchInRotatedArray {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int nums[] = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 0;

        int result = solution.search(nums, target);

        if (result == -1) {
            System.out.println("No number found");
        } else {
            System.out.println("Number found at index : " + result);
        }
    }
}

class Solution {
    // public int search(int[] nums, int target) {
    // for (int i = 0, j = nums.length - 1; i < j; i++, j--) {
    // if (nums[i] == target) {
    // return i;
    // } else if (nums[j] == target) {
    // return j;
    // }
    // }
    // return -1;
    // }
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int mid;

        while (start <= end) {
            mid = start + (end - start) / 2;

            if (target == nums[mid]) {
                return mid;
            }

            if (start == end && target == nums[start]) {
                return start;
            } else if (start == end && target != nums[start]) {
                break;
            }

            if (nums[start] <= nums[mid] && (target < nums[start] || target > nums[mid])) {
                start = mid + 1;
            } else if (nums[start] < nums[mid] && (target >= nums[start] && target < nums[mid])) {
                end = mid - 1;
            } else if (nums[mid] < nums[end] && (target <= nums[end] && target > nums[mid])) {
                start = mid + 1;
            } else if (nums[mid] <= nums[end] && (target > nums[end] || target < nums[mid])) {
                end = mid - 1;
            }
        }
        return -1;
    }
}
