class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n <= 2) return n;

        int k = 2; // first two elements always allowed

        for (int i = 2; i < n; i++) {
            // Compare with element two positions back
            if (nums[i] != nums[k - 2]) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }
}
