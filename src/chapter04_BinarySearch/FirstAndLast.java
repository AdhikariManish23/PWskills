package chapter04_BinarySearch;

import java.util.Arrays;

// First and Last Occuerencce of an element ?

public class FirstAndLast {
    public static int[] solution(int[] arr, int target) {

        int n = arr.length;
        int lb = -1, ub = -1;

        // First Occurence
        int s = 0, e = n - 1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] == target) {
                lb = mid;
                e = mid - 1;
            } else if (arr[mid] < target) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }

        // Second Occurence

        s = 0;
        e = n - 1;
        while (s <= e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] == target) {
                ub = mid;
                s = mid + 1;
            } else if (arr[mid] < target) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }

        return new int[] { lb, ub };
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 4, 4, 5, 6 };
        int target = 4;
        int[] ans = solution(arr, target);
        System.out.println(Arrays.toString(ans));
    }
}
