public class ReverseArray {
    int[] revArray(int[] nums) {
        int l = nums.length;
        for (int i = 0; i < l / 2; i++) {
            int temp = nums[i];
            nums[i] = nums[l - i - 1];
            nums[l - i - 1] = temp;
        }
        return nums;
    }

    public static void main(String[] args) {
        ReverseArray r = new ReverseArray();
        int[] nums = { 4, 5, 6, 7, 8, 1, 3, 9 };
        System.out.println("Original Array is ");
        for (int i : nums)
            System.out.print(i + " ");
        System.out.println();
        int[] revNum = r.revArray(nums);

        System.out.println("\nReverse Array is ");
        for (int i : revNum) {
            System.out.print(i + " ");
        }
    }
}
