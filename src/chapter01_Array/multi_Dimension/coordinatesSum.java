package chapter01_Array.multi_Dimension;

// Question : Given a matrix ‘A’ of dimension n x m and 2 coordinates (l1, r1) and (l2, r2). Return the sum of the rectangle from (l1,r1) to (l2, r2).

public class coordinatesSum {

    // sr = starting row , sc = starting column , er = ending row , ec = ending column
    public static int sum(int[][] arr, int sr, int sc, int er, int ec) {
        int sum = 0;
        for (int i = sr; i <= er; i++) {
            for (int j = sc; j <= ec; j++) {
                sum += arr[i][j];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3 }, { 2, 3, 6 }, { 5, 6, 0 }, { 0, 1, 2 } };
        int[][] arr1 = { { 1, 2, -3, 4 }, { 0, 0, -4, 2 }, { 1, -1, 2, 3 }, { -4, -5, -7, 0 } };
        int[][] arr2 = { { 1, 2, -3, 4 }, { 0, 0, -4, 2 }, { 1, -1, 2, 3 }, { -4, -5, -7, 0 } };

        System.out.println(sum(arr, 1, 1, 2, 2));
        System.out.println("PDF Example1 : " + sum(arr1, 1, 2, 3, 3));
        System.out.println("PDF Example2 : " + sum(arr2, 1, 0, 0, 3));

    }
}
