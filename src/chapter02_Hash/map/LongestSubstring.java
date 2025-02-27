package chapter02_Hash.map;

// LeetCode 3 : Given a string s, find the length of the longest substring without repeating characters.

import java.util.HashMap;

public class LongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        if (n <= 1)
            return n;
        int maxLen = 0;
        int i = 0, j = 0;

        HashMap<Character, Integer> map = new HashMap<>();
        while (j < n) {
            char ch = s.charAt(j);
            if (map.containsKey(ch) && map.get(ch) >= i) {
                int len = j - i;
                maxLen = Math.max(maxLen, len);
                
                while (s.charAt(i) != ch) i++; // yeah i++ tb hoga jb tk i or j equal nhi hote 
                i++; // ek aage nikalna hai
            }
            // agar key nhi hai toh add kr do with index number 
            map.put(ch, j);
            j++;
        }
        int len = j - i; // 
        maxLen = Math.max(maxLen, len);
        return maxLen;
    }

    public static void main(String[] args) {
        String s = "abcabcgbb";
        // String s = "a";
        System.out.println(lengthOfLongestSubstring(s));

    }
}
