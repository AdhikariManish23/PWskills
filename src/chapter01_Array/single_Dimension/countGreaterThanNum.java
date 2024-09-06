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
// Question :1     
        int[] arr = {5,7,8,2,10,76};
        int x = 2;
        int result = count(arr, x);
        System.out.println("Number of elements greater than target " + x + " is : " + result);

//  Question :2
        int[] nums = {2,5,4,7,8,5,3,2,33};
        int ans = countElements2(nums);
        System.out.println("Number of Elements With Strictly Smaller and Greater Elements : "+ans);
       ;

    }

// Question 2: Count Elements With Strictly Smaller and Greater Elements     
//  Brute Force :
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


//  Optimised Code :    

    public static int countElements2(int[] nums) {
        if (nums.length < 3) return 0;  // If the array has fewer than 3 elements, no elements can be strictly between min and max

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

    //  storing the minimum value and maximum value 
       for(int i = 0; i < nums.length;  i++){
            if(nums[i] < min) min = nums[i];
            if(nums[i] > max) max = nums[i];
        }

    //  calculating the count of Strictly Smaller and Greater Elements
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > min && nums[i] < max){
                count++;
            }
        }

        return count;
    }
    
}
