package chapter04_BinarySearch;

/*
 * Similar as LowerBound
 * arr = {10,20,30,30,40,50}
 * x = 30    ;   x = 35
 * lb = 2    ;   lb = 4
 * ub = 4    ;   ub = 4
 */

public class UpperBound {
    public static int findLowerBound(int[] arr, int target) {
        int n = arr.length;
        int ub = n;
        int s = 0, e = n - 1;

        while (s <= e) {
            int mid = (s + e) / 2;
            if (arr[mid] > target) { // difference is remove the equal from the condition
                ub = Math.min(mid, ub);
                e = mid - 1;
            } else
                s = mid + 1;
        }
        return ub;
    }

    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 30, 40, 50, 60, 70 };
        int target = 30; // 4
        System.out.println(findLowerBound(arr, target));

    }
}
