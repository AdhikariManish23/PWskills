package chapter01_Array.multi_Dimension;

// Question 

public class spiral_1 {

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

    
    public static void main(String[] args) {
        // int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int m = arr.length , n = arr[0].length;
        Print(arr);
    
    // Spiral print 

    int minR = 0 , maxR = m-1;
    int minC = 0 , maxC = n-1;

    while(minR <= maxR && minC <= maxC){
        
        // left top to right top
        for(int j = minC; j <= maxC; j++){
            System.out.print(arr[minR][j]+" ");
        }
        minR++;

        // top right to bottom right 
        if(minR>maxR || minC > maxC) break;
        for(int i = minR; i<= maxR; i++ ){
            System.out.print(arr[i][maxC]+" ");
        }
        maxC--;

        // bottom right to bottom left
        if(minR>maxR || minC > maxC) break;
        for(int j = maxC ; j >= minC; j--){
        System.out.print(arr[maxR][j]+" ");
        }
        maxR--;

        // left bottom to left top
        if(minR>maxR || minC > maxC) break;
        for(int i = maxR; i>= minR; i--){
            System.out.print(arr[i][minC]+" ");
        }
        minC++;
    }
  }
}