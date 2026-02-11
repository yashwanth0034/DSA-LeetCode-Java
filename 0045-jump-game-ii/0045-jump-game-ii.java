class Solution {
    public int jump(int[] nums) {

        int jumps = 0;
        int farthest = 0;
        int end = 0;

        for (int i = 0; i < nums.length - 1; i++) {

            // update farthest reachable index
            farthest = Math.max(farthest, i + nums[i]);

            // if we reach the end of current jump range
            if (i == end) {
                jumps++;
                end = farthest;
            }
        }

        return jumps;
    }
}
