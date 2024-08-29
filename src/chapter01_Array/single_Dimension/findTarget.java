package chapter01_Array.single_Dimension;

import java.util.Arrays;

// Question : Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
// Input nums = [2,7,11,15]  ,  target =9
// Output = [0,1]

public class findTarget {
    
    // Method 1: returning array in the method
    
    public static int[] SumTwo(int[] nums, int target){
        
        for(int i = 0; i < nums.length-1; i++){
            for(int j = i+1; j<nums.length; j++){
                if(nums[i]+nums[j] == target ){  // compare kra ki konsi 2 values ad hokr target bnaa rahi hai uske baad humne ek naya array bnaa kr return kr diya
                    return new int[] {i,j};   // esse hum on the line neew array create kr sakte hai
                }
            }
        }
        return new int[]{}; // yeah hum empty array return kr rhe hai
    }        
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int target = 9;
        int[] result =SumTwo(arr, target);
        // for(int i : result){
        //     System.out.print(i+" ");
        // }
         System.out.println(Arrays.toString(result)); 
        
    }
    

    // Method 2 : Without returning the array in the method

    // public static void sumTwo(int[] arr, int target){
    //     for(int i = 0; i < arr.length-1; i++){
    //         for(int j = i+1; j <arr.length; j++){
    //             if(arr[i]+arr[j] == target){
    //                 System.out.print(i+" "+j);
    //             }
    //         }
    //     }
    // }

    // public static void main(String[] args) {
    //     int[] arr = {2,7,11,15};
    //     int k = 17;

    //     sumTwo(arr, k);
    // }
}
