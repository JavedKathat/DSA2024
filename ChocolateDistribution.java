import java.util.Arrays;

public class ChocolateDistribution {
    public static int chocolateDistribution(int nums[], int m) {
        if (nums.length == 0 || m == 0) {
            return 0;
        }

        Arrays.sort(nums);

        if (nums.length - 1 < m) {
            return -1;
        }
        int minDiff = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int nextWindow = i + m - 1;

            if (nextWindow >= nums.length) {
                break;
            }

            int diff = nums[nextWindow] - nums[i];

            minDiff = Math.min(minDiff, diff);
        }
        return minDiff;
    }

    public static void main(String[] args) {
        int nums[] = { 12, 4, 7, 9, 2, 23, 25, 41, 30, 40, 28, 42, 30, 44, 48, 43, 50 };
        // int nums[] = { 7, 3, 2, 4, 9, 12, 56 };
        // int m = 3; // number of students
        int m = 7; // number of students

        int result = chocolateDistribution(nums, m);

        if (result != -1) {
            System.out.println("Minimum difference is " + result);
        } else {
            System.out.println("Invalid input");
        }
    }
}
