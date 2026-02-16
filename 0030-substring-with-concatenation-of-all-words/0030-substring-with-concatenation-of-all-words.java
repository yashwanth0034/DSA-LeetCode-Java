import java.util.*;

class Solution {
    public List<Integer> findSubstring(String s, String[] words) {

        List<Integer> result = new ArrayList<>();

        if (s.length() == 0 || words.length == 0)
            return result;

        int wordLen = words[0].length();
        int wordCount = words.length;
        int totalLen = wordLen * wordCount;

        // Frequency map of words
        HashMap<String, Integer> wordMap = new HashMap<>();
        for (String w : words)
            wordMap.put(w, wordMap.getOrDefault(w, 0) + 1);

        // Sliding window for each offset
        for (int i = 0; i < wordLen; i++) {

            int left = i, count = 0;
            HashMap<String, Integer> windowMap = new HashMap<>();

            for (int right = i; right + wordLen <= s.length(); right += wordLen) {

                String word = s.substring(right, right + wordLen);

                if (wordMap.containsKey(word)) {

                    windowMap.put(word, windowMap.getOrDefault(word, 0) + 1);
                    count++;

                    // If word occurs too many times → shrink window
                    while (windowMap.get(word) > wordMap.get(word)) {

                        String leftWord = s.substring(left, left + wordLen);
                        windowMap.put(leftWord, windowMap.get(leftWord) - 1);

                        left += wordLen;
                        count--;
                    }

                    // If full match found
                    if (count == wordCount)
                        result.add(left);

                } else {
                    // Reset window
                    windowMap.clear();
                    count = 0;
                    left = right + wordLen;
                }
            }
        }

        return result;
    }
}
