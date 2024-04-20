public class MaxSubArray {
    public static void main(String[] args) {
        int nums[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int l = nums.length;
        int maxSum = -99999, sum, prevSum;

        for (int i = 0; i < l; i++) {
            prevSum = 0;
            sum = 0;
            for (int j = i; j < l; j++) {
                sum = prevSum + nums[j];
                if (sum > maxSum) {
                    maxSum = sum;
                }
                prevSum = sum;
            }
        }
        System.out.println("MaxSubArray = " + maxSum);
    }
}
