class Solution {
    public boolean isSubsequence(String s, String t) {

        int i = 0; // pointer for s
        int j = 0; // pointer for t

        while (i < s.length() && j < t.length()) {

            if (s.charAt(i) == t.charAt(j)) {
                i++; // match found, move in s
            }

            j++; // always move in t
        }

        return i == s.length();
    }
}
