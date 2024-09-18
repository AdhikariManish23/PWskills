package chapter01_Array.multi_Dimension;

// Question : Write a Program to add two matrices

public class additionOfTwo2DArray {

// Brute Force : Taking Extra Space

    // public static int[][] addition (int[][] a , int[][] b){
    //     int m = a.length;
    //     int n = a[0].length;
        
    //     int [][] ans = new int[m][n];

    //     for(int i = 0 ; i < m ; i++){
    //         for(int j = 0 ; j < n; j++){
    //             ans[i][j] = a[i][j] + b[i][j];
    //         }
    //     }

    //     return ans;
    // }



//  Optimised Code : Witout Taking Extra Space

    public static int[][] addition (int[][] a , int[][] b){
        int m = a.length;
        int n = a[0].length;
        
        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < n; j++){
                a[i][j] += b[i][j];
            }
        }

        return a;
    }
    public static void main(String[] args) {
        int[][] a = {{1,9,2}, {3,7,4},{8,5,6}};
        int[][] b = {{9,3,7}, {8,6,5},{2,4,1}};

        int[][] ans = addition(a, b);
       
        for(int i = 0 ; i < ans.length; i++){
            for(int j = 0 ; j < ans.length; j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
        
    }
}

