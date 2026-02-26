class Solution {
    public int[] sortByBits(int[] arr) {
        Integer[] nums = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        
        Arrays.sort(nums, (a, b) -> {
            int countA = countBits(a);
            int countB = countBits(b);
            
            if (countA == countB) return a - b;
            return countA - countB;
        });
        
        return Arrays.stream(nums).mapToInt(i -> i).toArray();
    }
    
    private int countBits(int n) {
        int count = 0;
        while (n > 0) {
            count += n & 1;
            n >>= 1;
        }
        return count;
    }
}