package chapter04_BinarySearch;

import java.util.Arrays;

/*Input : nums =[3, 4, 4, 7, 8, 10], x= 5
Output: 4 7
Explanation: The floor of 5 in the array is 4, and the ceiling of 5 in the array is 7. */
public class FloorAndCeil {
    public static int[] getFloorAndCeil(int[] arr, int target) {
        int n = arr.length;
        int lb = -1, ub = -1;

        // Finding Floor
        int s = 0, e = n - 1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] <= target) {
                lb = arr[mid];
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }

        // Finding Ceil
        s = 0;
        e = n - 1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] >= target) {
                ub = arr[mid];
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }

        return new int[] { lb, ub };
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5, 6 };
        int target = 4;
        // int[] ans = getFloorAndCeil(arr, target);
        // System.out.println(Arrays.toString(ans));
        System.out.println(Arrays.toString(getFloorAndCeil(arr, target)));
    }
}
