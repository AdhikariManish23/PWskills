package chapter01_Array.multi_Dimension;

public class flippingMatrix {

    public int matrixScore(int[][] arr) {
        int m = arr.length, n = arr[0].length;

        // Step 1: Ensure first column is all 1s
        for (int i = 0; i < m; i++) {
            if (arr[i][0] == 0) {
                for (int j = 0; j < n; j++) {
                    arr[i][j] ^= 1; // Flip 0->1 and 1->0 using XOR
                }
            }
        }

        // Step 2: For columns 1 to n-1, flip if more 0s than 1s
        for (int j = 1; j < n; j++) {
            int countOnes = 0;
            for (int i = 0; i < m; i++) {
                if (arr[i][j] == 1)
                    countOnes++;
            }
            if (countOnes < m - countOnes) { // More 0s than 1s
                for (int i = 0; i < m; i++) {
                    arr[i][j] ^= 1;
                }
            }
        }

        // Step 3: Calculate the score
        int score = 0;
        for (int i = 0; i < m; i++) {
            int rowValue = 0;
            for (int j = 0; j < n; j++) {
                rowValue = (rowValue << 1) | arr[i][j];
            }
            score += rowValue;
        }

        return score;
    }

    // Main method for testing
    public static void main(String[] args) {
        flippingMatrix fm = new flippingMatrix();

        // Example input
        int[][] matrix = {
                { 0, 0, 1, 1 },
                { 1, 0, 1, 0 },
                { 1, 1, 0, 0 }
        };

        int result = fm.matrixScore(matrix);
        System.out.println("Maximum score after flipping: " + result);
    }
}
