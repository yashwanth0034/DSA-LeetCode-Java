import java.util.HashSet;

class Solution {
    public boolean hasAllCodes(String s, int k) {
        if (s.length() < k) return false;
        
        HashSet<Integer> set = new HashSet<>();
        int n = s.length();
        
        for (int i = 0; i <= n - k; i++) {
            int num = Integer.parseInt(s.substring(i, i + k), 2);
            set.add(num);
        }
        
        return set.size() == (1 << k);
    }
}