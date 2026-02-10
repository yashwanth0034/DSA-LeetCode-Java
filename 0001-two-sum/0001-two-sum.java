import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {

        // HashMap to store number and its index
        HashMap<Integer, Integer> map = new HashMap<>();

        // Loop through array
        for (int i = 0; i < nums.length; i++) {

            int complement = target - nums[i];

            // If complement exists, return answer
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }

            // Store current number with index
            map.put(nums[i], i);
        }

        return new int[] {}; // will never reach (exactly one solution exists)
    }
}
