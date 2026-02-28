class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int total = numBottles;
        int empty = numBottles;

        while (empty >= numExchange) {
            empty = empty - numExchange + 1;
            total++;
            numExchange++;
        }

        return total;
    }
}