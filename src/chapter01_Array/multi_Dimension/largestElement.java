package chapter01_Array.multi_Dimension;

public class largestElement {
    public static int solution (int[][] arr){
        
         int max = Integer.MIN_VALUE;

         for(int i = 0; i< arr.length; i++){
            for(int j  = 0 ; j< arr.length; j++){
                max = Math.max(max,arr[i][j]);
            }
         }

        return max;
    }

    public static void main(String[] args) {
        int[][] arr = {{132,212,365},{956,843,754},{23,89,100}};
        System.out.println("Largest Element in 2D Arrays is : "+solution(arr));
    }
}
