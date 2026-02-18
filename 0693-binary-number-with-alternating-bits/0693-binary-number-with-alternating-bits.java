class Solution {
    public boolean hasAlternatingBits(int n) {

        // Get last bit
        int prevBit = n & 1;

        // Shift right
        n = n >> 1;

        while (n > 0) {

            // Get current last bit
            int currBit = n & 1;

            // If two adjacent bits are same
            if (currBit == prevBit) {
                return false;
            }

            // Update previous bit
            prevBit = currBit;

            // Move to next bit
            n = n >> 1;
        }

        return true;
    }
}
