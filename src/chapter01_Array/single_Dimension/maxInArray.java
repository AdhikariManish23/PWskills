package chapter01_Array.single_Dimension;

public class maxInArray {
    public static void main(String[] args) {
        int[] arr = {10,3,404,50,7,87};
        // int max = 0; rather than using 0 you can use Integer.MIN_VALUE
        int max = Integer.MIN_VALUE;  // it will stores the Smallest Integer of this Bracket which is -214783648 
        for(int i =0; i < arr.length; i++){
            // if(arr[i] > max){
            //     max = arr[i];

  // Optimised way Of Compare           
            max = Math.max(max,arr[i]);      
        }
        System.out.println(max);
      }
}
