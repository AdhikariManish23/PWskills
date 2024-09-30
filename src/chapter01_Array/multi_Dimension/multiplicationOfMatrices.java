package chapter01_Array.multi_Dimension;

// Question : Write a program to print the multiplication of two matrices given by the user.

public class multiplicationOfMatrices {
    public static void Print(int[][] arr){
        int m = arr.length, n = arr[0].length;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }

// Note : Focus on all the .length property used here 
    public static void main(String[] args) {
        int[][] a = {{1,2,1},{2,1,2}};
        int[][] b = {{1,0,1,2}, {2,1,0,0}, {0,3,1,1}};

        if(a[0].length != b.length){
            System.out.println("Multiplication not : ");
        }
        else{
            int[][] c = new int[a.length][b[0].length];   

            for(int i = 0; i < c.length; i++){
                for(int j = 0; j < c[0].length; j++){

             // c[i][j] = a[i][0]*b[0][j] + a[i][1]*b[1][j] + a[i][2]*b[2][j] + ......  for this we run the another loop
                    for(int k = 0; k < b.length; k++){
                        c[i][j] += a[i][k] * b[k][j];
                    }
                }
            }
            System.out.println("a Matrices :");
            Print(a);
            System.out.println("b Matrices :");
            Print(b);
            System.out.println("Product Matrices :");
            Print(c);
        }
    }
}

