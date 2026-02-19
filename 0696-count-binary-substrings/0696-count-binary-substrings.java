class Solution {
    public int countBinarySubstrings(String s) {

        int prevGroup = 0;   // previous group length
        int currGroup = 1;   // current group length
        int result = 0;

        for (int i = 1; i < s.length(); i++) {

            // If same character, increase current group
            if (s.charAt(i) == s.charAt(i - 1)) {
                currGroup++;
            }
            // Character changed → group ended
            else {
                result += Math.min(prevGroup, currGroup);

                prevGroup = currGroup;
                currGroup = 1;
            }
        }

        // Add last group pair
        result += Math.min(prevGroup, currGroup);

        return result;
    }
}
