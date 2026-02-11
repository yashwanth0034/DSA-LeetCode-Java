class Solution {
    public boolean canJump(int[] nums) {

        int farthest = 0;

        for (int i = 0; i < nums.length; i++) {

            // If we can't even reach this index
            if (i > farthest) {
                return false;
            }

            // Update farthest reachable index
            farthest = Math.max(farthest, i + nums[i]);

            // If we can reach the last index early
            if (farthest >= nums.length - 1) {
                return true;
            }
        }

        return true;
    }
}

