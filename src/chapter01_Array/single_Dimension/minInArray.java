package chapter01_Array.single_Dimension;

// Find the minimum value of an array

public class minInArray {
    public static void main(String[] args) {
        int[] arr = {220,33,5,70,11,44,55};
       
        int min = Integer.MAX_VALUE;
        for(int i = 0; i< arr.length; i++){
           
            min = Math.min(arr[i], min); 
        }

        System.out.println("Minimum Value of Array : "+min);
    }
    
    
}
