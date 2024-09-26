package chapter01_Array.multi_Dimension;

// Question : Given a positive integer n, generate an n x n matrix filled with elements from 1 to n2 in spiral order. 

public class spiral_2 {
    public static void main(String[] args) {
        int n = 5; // Change this to your desired size
        int[][] arr = new int[n][n]; // Creating an n x n array

        int minR = 0, maxR = n - 1;
        int minC = 0, maxC = n - 1;
        int value = 1;

        // Spiral filling logic
        while (minR <= maxR && minC <= maxC) {

            // Left top to right top (moving across the top row)
            for (int j = minC; j <= maxC; j++) {
                arr[minR][j] = value++;
            }
            minR++; // Move top boundary down

            // Top right to bottom right (moving down the right column)
            for (int i = minR; i <= maxR; i++) {
                arr[i][maxC] = value++;
            }
            maxC--; // Move right boundary left

            // Bottom right to bottom left (moving across the bottom row)
            if (minR <= maxR) {  // Check if there are remaining rows
                for (int j = maxC; j >= minC; j--) {
                    arr[maxR][j] = value++;
                }
                maxR--; // Move bottom boundary up
            }

            // Left bottom to left top (moving up the left column)
            if (minC <= maxC) {  // Check if there are remaining columns
                for (int i = maxR; i >= minR; i--) {
                    arr[i][minC] = value++;
                }
                minC++; // Move left boundary right
            }
        }

        // Print the 2D array
        printMatrix(arr, n);
    }



    // Helper function to print 2D matrix
    public static void printMatrix(int[][] arr, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

