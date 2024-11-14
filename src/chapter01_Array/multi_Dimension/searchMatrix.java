package chapter01_Array.multi_Dimension;

//  Search in 2D matrix 

public class searchMatrix {

    // Not Optimise CODE ::

    // public static boolean solution1(int[][] arr, int target) {
    // int m = arr.length, n = arr[0].length;

    // for (int i = 0; i < m; i++) {
    // for (int j = 0; j < n; j++) {
    // if (arr[i][j] == target)
    // return true;
    // }
    // }
    // return false;
    // }

    // Optimised Code ::
    public static boolean solution1(int[][] arr, int target) {
        int m = arr.length, n = arr[0].length;

        int i = 0, j = n - 1;

        while (i < m && j >= 0) {
            if (arr[i][j] == target)
                return true;
            else if (arr[i][j] > target) { // go left
                j--;
            } else { // go down
                i++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] arr = { { 1, 4, 7, 11, 15 }, { 2, 5, 8, 12, 19 }, { 3, 6, 9, 16, 22 }, { 10, 13, 14, 17, 24 },
                { 18, 21, 23, 26, 30 } };

        System.out.println(solution1(arr, 12));
    }
}
