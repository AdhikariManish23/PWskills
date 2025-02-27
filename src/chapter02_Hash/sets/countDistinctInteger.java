package chapter02_Hash.sets;

// Question : count Number of Distinct Integers After Reverse Operation. Leetcode 2442

import java.util.HashSet;

public class countDistinctInteger {
    public static int countNumber(int[] num) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < num.length; i++) {
            set.add(num[i]);
            set.add(reverse(num[i]));
        }
        return set.size();
    }

    public static int reverse(int n) {
        int r = 0;
        while (n != 0) {
            r = r * 10 + n % 10; // The modulo operation (% 10) gives the last digit of n. Multiply r by 10 (to
                                 // shift its digits left)
            n /= 10; // Divide n by 10 to discard its last digit.
        }
        return r;
    }

    public static void main(String[] args) {
        int[] arr = { 12, 3, 23, 43, 21 };
        System.out.println(countNumber(arr));
    }
}

/*
 * Explanation of reverse function
 * 
 * iteration 2:
 * r = 4
 * 𝑛=123
 * 
 * Extract the last digit:
 * 𝑛%10=3
 * 
 * Update r:
 * r=r∗10+(n%10)=4∗10+3=43
 * 
 * Remove the last digit of n:
 * n=n/10=12
 * 
 * r = 43
 */