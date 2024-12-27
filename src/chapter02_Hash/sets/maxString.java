package chapter02_Hash.sets;

import java.util.HashSet;

// Question : Find the Maximum of String Pairs . LeetCode 2744
// Input : {"cd", "ac", "dc", "ca","tu"}
// Output : 2

public class maxString {

    // 1 : More Optimised Code
    public static int maximumNumberOfStringPairs(String[] words) {
        int maxPairs = 0;
        HashSet<String> wordSet = new HashSet<>();
        for (String word : words) {
            StringBuilder sb = new StringBuilder(word);
            String reversedWord = sb.reverse().toString();

            if (wordSet.contains(reversedWord)) {
                maxPairs++;
                wordSet.remove(reversedWord); // this will help to use each word pair Once . below example you can see
                                              // dc appear two time but cd will pair only with 1st dc
            }
            wordSet.add(word);
        }
        return maxPairs;
    }

    // 2 : Method
    public static int MaximumString(String[] s) {
        int count = 0;
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < s.length; i++) {
            String re = reverse(s[i]);

            if (set.contains(re)) {
                count++;
                set.remove(re); // this will help to use each word pair Once . below example you can see dc
                                // appear two time but cd will pair only with 1st dc
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
        System.out.println(maximumNumberOfStringPairs(st));
    }
}
