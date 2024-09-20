package chapter01_Array.multi_Dimension;

//  Question : Write a program to change the given matrix with its transpose ?
//  humko extra space nhi leni hai jo 2D array hai ussi mai uska transpose store krna hai ,, yeah sirf SQUARE matrix mai he ho sakta hai

public class squareTranspose {
    public static void print(int[][] arr){
        int m = arr.length, n = arr[0].length;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }


// NOTE: In this only Swapping is not the main part that why we write code in the main body 
    // public static void swap(int[][] arr){ // swap elements within a single 2D array
    //     int m = arr.length, n = arr[0].length;
    //     for(int i = 0; i < m; i++){
    //         for(int j = 0; j < n; j++){
    //             int temp  = arr[i][j];
    //             arr[i][j] = arr[j][i];
    //             arr[j][i] = temp;
    //         }
    //     }
    // }

    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int m = arr.length; // here we are not taking n beacuse the matrix are square means columns and row are Equal
        print(arr);

//  Traverse the loop on the matrix in L pattern to avoid the double swap of the Characters .        
        for(int i  = 0; i < m; i++){    
            for(int j = 0; j < i; j++){
                int temp  = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        System.out.println("tranposed matrix : ");
        print(arr);
    }
}

/* 
Approach :  humne notice kiya ki ek 2D array jo ki SQUARE shape
            mai uske diagonal mai koi change nhi hai or 
            uske alawa arr[i][j] swap ho rhe hai arr[j][i] se.
            FOUCS part is traversing the Loop in L shape.
 */ 

