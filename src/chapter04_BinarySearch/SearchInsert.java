package chapter04_BinarySearch;

public class SearchInsert {
    public static int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int ans = n; // Default insert at end of array
        int s = 0, e = n - 1;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            // If current element is greater than or equal to target,
            // this could be a potential answer, move left to find better option.
            if (nums[mid] >= target) {
                ans = mid;
                e = mid - 1;
            } else {
                // If current element is less than target, go right
                s = mid + 1;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5, 6 };
        int target = 4;
        System.out.println(searchInsert(arr, target));
    }

}
