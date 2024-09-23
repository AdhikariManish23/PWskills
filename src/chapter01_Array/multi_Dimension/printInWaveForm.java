package chapter01_Array.multi_Dimension;

// Question : Write a program to print the matrix in wave form ?
// input : 123 456 789
// output : 123 654 789

public class printInWaveForm {

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




    public static void waveRowPrinting(int[][] arr){

    int m = arr.length, n = arr[0].length;
       
//  Patter 1: left to right than right to left
        for(int i = 0; i< m; i++){
            if(i % 2 == 0){
                for(int j = 0; j < n; j++){
                    
                    System.out.print(arr[i][j]+" ");
                }
            }else{
                for(int j = n-1; j >= 0; j--){
                    System.out.print(arr[i][j]+" ");
                    
                }
            }
            System.out.println();
        }
        System.out.println();
      
//  Pattern 2: right to left than left to right 
        // for(int i = 0; i< m; i++){
        //     if(i % 2 == 0){
        //         for(int j = n-1; j >= 0; j--){
                   
        //             System.out.print(arr[i][j]+" ");
        //         }
        //     }else{
        //         for(int j = 0; j < n; j++){
        //             System.out.print(arr[i][j]+" ");
                    
        //         }
        //     }
        //     System.out.println();
        // }
    }


    public static void waveColumnPrinting(int[][] arr){
        int m = arr.length, n = arr[0].length;
//  Pattern 3:   top left to bottom right than bottom right to top 
            for(int j = 0; j < n ; j++){
                if(j % 2 == 0){
                    for(int i = 0; i < m; i++){
                        System.out.print(arr[i][j]+" ");
                    }
                }else{
                    for(int i = m-1; i >= 0; i--){
                        System.out.print(arr[i][j]+" ");
                    }
                }
                
            }
     
//  Pattern 4: bottom left to top right than top right to bottom            
            // for(int j = 0; j < n ; j++){
            //     if(j % 2 == 0){
            //         for(int i = m-1; i >= 0; i--){
            //             System.out.print(arr[i][j]+" ");
            //         }
            //     }else{
            //         for(int i = 0; i < m; i++){
            //             System.out.print(arr[i][j]+" ");
            //         }
            //     }
                
            // }
    
    }
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        // int[][] arr = {
        //     {1,2,3,4},
        //     {5,6,7,8},
        //     {9,10,11,12},
        //     {13,14,15,16}
        // };
        System.out.println("Given Array row wise :");
        Print(arr);
      
        System.out.println("Row Wave Printing : ");
        waveRowPrinting(arr); 
        
        System.out.println("Given array column wise : ");
        Print(arr);

        System.out.println("Column Wave Printing");
        waveColumnPrinting(arr);
    }
}
