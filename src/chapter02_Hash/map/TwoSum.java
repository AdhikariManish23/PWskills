package chapter02_Hash.map;

import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int[] ans = { -1, -1 }; // Default values if no solution is found
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int rem = target - nums[i];
            if (map.containsKey(rem)) {
                ans[0] = map.get(rem); // Get the earlier index
                ans[1] = i; // Current index
                break;
            } else {
                map.put(nums[i], i); // Store value and its index
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 5, 6, 2, 8, 9 };
        int target = 10;

        int[] print = twoSum(arr, target);

        if (print[0] == -1 && print[1] == -1) {
            System.out.println("No two sum solution found.");
        } else {
            System.out.println("Indices: " + print[0] + ", " + print[1]);
        }
    }
}
