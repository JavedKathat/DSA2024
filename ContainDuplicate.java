class ContainDuplicate {
    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4 };
        Solution sln = new Solution();
        if (sln.containsDuplicate(nums)) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
    }
}