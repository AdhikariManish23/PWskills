package chapter02_Hash.sets;

import java.util.HashSet;

// Question : Find the Maximum of String Pairs . LeetCode 2744
// Input : {"cd", "ac", "dc", "ca","tu"}
// Output : 2

public class maxString {

    public static int MaximumString(String[] s) {
        int count = 0;
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < s.length; i++) {
            String re = reverse(s[i]);

            if (set.contains(re)) {
                count++;
                set.remove(re);
            } else
                set.add(s[i]);
        }

        return count;
    }

    public static String reverse(String n) {
        StringBuilder sb = new StringBuilder(n);
        sb.reverse();

        return sb.toString();
    }

    public static void main(String[] args) {
        String[] st = { "cd", "ac", "dc", "fg", "ca", "tu", "ut", "dc" };

        System.out.println(MaximumString(st));
    }
}
