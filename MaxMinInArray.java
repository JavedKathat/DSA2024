class MaxMinInArray {
    int maxElement(int nums[]) {
        int l = nums.length - 1;
        int max = nums[0];

        for (int i = 0; i < l; i++) {
            if (nums[i] > max)
                max = nums[i];
        }
        return max;
    }

    int minElement(int nums[]) {
        int l = nums.length - 1;
        int min = nums[0];
        for (int i : nums) {
            if (i < min)
                min = nums[i];
        }
        return min;
    }

    public static void main(String[] args) {
        MaxMinInArray o = new MaxMinInArray();
        int[] arr = { 4, 7, 9, 3, 5, 6, 11, 13, 8 };
        System.out.print("[ ");
        for (int i : arr) {
            System.out.print(i + ", ");
        }
        System.out.println("]");
        System.out.println("Max element in an Array is " + o.maxElement(arr));
        System.out.println("Min element in an Array is " + o.minElement(arr));
    }
}