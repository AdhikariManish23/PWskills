package chapter01_Array.multi_Dimension;

//                                        NOT completed 

public class flippingMatrix {
    public int matrixScore(int[][] arr) {
        int m = arr.length, n = arr[0].length;
        // putting 1 at the 0th positon of every row

        for (int i = 0; i < m; i++) {
            if (arr[i][0] == 0) { // flip that row
                for (int j = 0; j < n; j++) { // now we entered to that particular row and change the zeros and ones
                    if (arr[i][j] == 0)
                        arr[i][j] = 1;
                    else
                        arr[i][j] = 0;
                }
            }
        }
        for (int j = 1; j < n; j++) {
            int noOfZeros = 0, noOfOnes = 0;
            for (int i = 0; i < m; i++) {
                if (arr[i][j] == 0)
                    noOfZeros++;
                else
                    noOfOnes++;
            }
            if (noOfZeros > noOfOnes) {
                for (int i = 0; i < n; i++) {
                    if (arr[i][j] == 0)
                        arr[i][j] = 1;
                    else
                        arr[i][j] = 0;
                }
            }
        }
    }
}
