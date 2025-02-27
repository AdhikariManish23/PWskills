package chapter04_BinarySearch;

public class Basics {
    // Change the return type if you want Index of Your Target ;
    static boolean binarySearch(int[] arr, int target) {
        int n = arr.length;
        int start = 0;
        int end = n - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (target == arr[mid]) {
                return true;
                // return mid ; In case you want Index of your Target
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return false;
        // return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 8, 9, 10, 15, 18, 20, 25 };
        // int target = 23;
        // System.out.println(binarySearch(arr,target));

        int target = 0;
        while (target != 10) {
            System.out.println(target + " exists in arr: " + binarySearch(arr, target));
            target++;
        }

    }
}
