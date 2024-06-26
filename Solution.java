import java.util.HashSet;

class Solution {

    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> check = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (check.contains(nums[i])) {
                return true;
            }
            check.add(nums[i]);
        }
        return false;
    }
}
