package chapter02_Hash.sets;

import java.util.HashSet;

// Find the Prefix Sum 0 

public class PrefixSum {
    public static boolean hasSubarrayWithZeroSum(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        int prefixSum = 0;

        for (int num : arr) {
            prefixSum += num;

            // Check if prefixSum is 0, or num is 0, or prefixSum already exists in HashSet
            if (prefixSum == 0 || set.contains(prefixSum) || num == 0) {
                return true;
            }

            // Add the current prefixSum to the HashSet
            set.add(prefixSum);
        }

        // If no subarray with sum 0 is found
        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 5, 4, 2, -3, 1, 6 };

        System.out.println(hasSubarrayWithZeroSum(arr));
    }

}
