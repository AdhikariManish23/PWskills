package chapter01_Array.single_Dimension;

import java.util.Arrays;

// Question : Rotate the Array 'arr' by k steps. where k is non-negative. k can be greater than n (size of array)
// https://leetcode.com/problems/rotate-array/description/

public class rotateArray {
    
//  method of reversing the array  
    public static void reverse(int[] arr, int i, int j){
        while (i<j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

//  method rotate from k steps
    public static void rotate(int[] arr,int k){
        int n = arr.length;
        k = k%n;
        reverse(arr, 0, n-k-1);
        reverse(arr, n-k, n-1);
        reverse(arr, 0, n-1);
    }    

    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70};
        System.out.println(Arrays.toString(arr));
        int k = 4;    // k= 4 ka matlab hua ki last se 4 elemnt front mai aayenge
        rotate(arr, k);
        System.out.println(Arrays.toString(arr));        
    }
}
