package chapter01_Array.single_Dimension;

import java.util.Arrays;

// Question 1: Count the number of elements strictly greater than x.

public class countGreaterThanNum {
    
    public static int count(int[] arr, int x){
        int count = 0;
        for(int i =0; i< arr.length; i++){
            if(arr[i] > x){
                count++;
            }
        }
        return count;
    }
    
    public static void main(String[] args) {
        int[] arr = {5,7,8,2,10,76};
        int x = 2;
        int result = count(arr, x);
        System.out.println("Number of elements greater than target " + x + " is : " + result);

//  Another Question Array
        int[] nums = {11,2,7,15};
        int ans = countElements(nums);
        System.out.println("Number of Elements With Strictly Smaller and Greater Elements : "+ans);
       ;

    }

// Question 2: Count Elements With Strictly Smaller and Greater Elements     

     public static int countElements(int[] nums) {
      int count =0;
        Arrays.sort(nums);
        int l = nums[0];
        int r = nums[nums.length-1];
        for(int i=1 ; i< nums.length -1 ; i++){
          if(nums[i] >l && nums[i]<r){
              count++;
          }
        }
        return count;
    }

    
}
