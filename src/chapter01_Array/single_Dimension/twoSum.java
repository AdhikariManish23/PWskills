package chapter01_Array.single_Dimension;

import java.util.Arrays;

// Question : Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
// Input nums = [2,7,11,15]  ,  target =9
// Output = [0,1]

public class twoSum {
     public static int[] SumTwo(int[] nums, int target){
        
        for(int i = 0; i < nums.length-1; i++){
            for(int j = i+1; j<nums.length; j++){
                if(nums[i]+nums[j] == target ){
                    return new int[] {i,j};
                }
            }
        }
        return new int[]{};
    }        
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int target = 9;
        int[] result =SumTwo(arr, target);
        System.out.println(Arrays.toString(result));
    }
}
