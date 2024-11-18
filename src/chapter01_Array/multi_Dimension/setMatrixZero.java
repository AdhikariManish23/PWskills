package chapter01_Array.multi_Dimension;

public class setMatrixZero {

    // METHOD 1 :

    // public static void setZeros(int[][] arr) {

    // int m = arr.length, n = arr[0].length;

    // boolean[] row = new boolean[m];
    // boolean[] col = new boolean[n];

    // // Marking the particular row and col
    // for (int i = 0; i < m; i++) {
    // for (int j = 0; j < n; j++) {
    // if (arr[i][j] == 0) {
    // row[i] = true;
    // col[j] = true;
    // }
    // }
    // }

    // for (int i = 0; i < m; i++) {
    // if (row[i] == true) {
    // for (int j = 0; j < n; j++) {
    // arr[i][j] = 0;
    // }
    // }
    // }

    // for (int j = 0; j < n; j++) {
    // if (col[j] == true) {
    // for (int i = 0; i < m; i++) {
    // arr[i][j] = 0;
    // }
    // }
    // }
    // }

    // METHOD 2 : Space Wise Optimised

    public static void setZeros(int[][] arr) {

        int m = arr.length, n = arr[0].length;
        boolean zeroRow = false;
        boolean zeroCol = false;

        // checking the 0th col
        for (int i = 0; i < m; i++) {
            if (arr[i][0] == 0) {
                zeroCol = true;
                break;
            }
        }

        // checking the 0th row
        for (int j = 0; j < n; j++) {
            if (arr[0][j] == 0) {
                zeroRow = true;
                break;
            }
        }

        // now traversing from 1 index from both row and col
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (arr[i][j] == 0) {
                    arr[i][0] = 0;
                    arr[0][j] = 0;
                }
            }
        }

        // traverse in the 0th row
        for (int j = 1; j < n; j++) {
            if (arr[0][j] == 0) {
                for (int i = 1; i < m; i++) {
                    arr[i][j] = 0;
                }
            }
        }
        // traverse in the 0th col
        for (int i = 1; i < m; i++) {
            if (arr[i][0] == 0) {
                for (int j = 1; j < m; j++) {
                    arr[i][j] = 0;
                }
            }
        }

        // If 0th row was marked for zeroing, set all elements in the 0th row to 0
        if (zeroRow) {
            for (int j = 0; j < n; j++) {
                arr[0][j] = 0;
            }
        }

        // If 0th column was marked for zeroing, set all elements in the 0th column to 0
        if (zeroCol) {
            for (int i = 0; i < m; i++) {
                arr[i][0] = 0;
            }
        }
    }

    // Function to print the matrix
    public static void printMatrix(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // int[][] arr = { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };
        int[][] arr = { { 0, 1, 2, 0 }, { 3, 4, 5, 2 }, { 1, 3, 1, 5 } };

        System.out.println("Original Matrix :");
        printMatrix(arr);

        setZeros(arr);

        System.out.println("Matrix after setting Zeros : ");
        printMatrix(arr);
    }
}
