package chapter01_Array.multi_Dimension;

// Question : Write a program to print the Transpose of the Matrix entered by the user and Store in a new matrix ?
// Transpose means Column wise Printing

public class transposeOfMatrix {
    public static void main(String[] args) {
        int[][] arr = {{1, 2}, {3, 4}, {5, 6}};
        int m  = arr.length , n = arr[0].length;

        System.out.println("Row Wise Printing : ");
        for(int i = 0; i < m; i++){
            for(int j = 0; j <n; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("Column Wise Printing : ");

        // Store in a new matrix
        int[][] transpose = new int[n][m];
        for(int j = 0; j < n; j++){
            for(int i = 0; i <m; i++){
                transpose[j][i] = arr[i][j];
                System.out.print(transpose[j][i]+" ");    
            }
            System.out.println();
        }

    }
}
