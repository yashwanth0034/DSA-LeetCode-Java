import java.util.*;

class Solution {
    public int maxFrequencyElements(int[] nums) {

        // Step 1: Frequency map
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        // Step 2: Find maximum frequency
        int maxFreq = 0;
        for (int count : freq.values()) {
            maxFreq = Math.max(maxFreq, count);
        }

        // Step 3: Count elements having maximum frequency
        int result = 0;
        for (int count : freq.values()) {
            if (count == maxFreq) {
                result += count;
            }
        }

        return result;
    }
}
