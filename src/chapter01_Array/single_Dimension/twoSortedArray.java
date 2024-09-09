package chapter01_Array.single_Dimension;

// Merge Two Sorted Array in One Array
// Input : a => {12,33,53,75} , b => {10,40,62,81}
// output: c=> {10,12,33,40,53,62,75,81}


public class twoSortedArray {
// Brute Force using extra space (3 Pointers Approach)
    public static int[] mergeTwoArray(int[] arr1,int [] arr2){
        int n = arr1.length;
        int m = arr2.length;
        int[] ans = new int[n+m];

        int i = 0,j =0, k =0;

        while(i < n && j < m){
            if(arr1[i] < arr2[j]){
                ans[k] = arr1[i];
                k++;
                i++;
            }else{
                ans[k] = arr2[j];
                k++;
                j++;
            }
        }
 // Add remaining elements from arr1 (if any)
        while(i < n){
            ans[k++] = arr1[i++];
        }
 // Add remaining elements from arr2 (if any)
         while(j < m){
            ans[k++] = arr2[j++];
        }       
        return ans;
        
    }

//  Optimised Code Without creating a new array (this code is not working)
    public static int[] merging(int[] arr1,int[] arr2 ){

    int n = arr1.length;
    int m = arr2.length;

    int i = 0, j = 0;
    while(i < n && j < m){
        if(arr1[i] > arr2[j]){
            arr1[i] = arr2[j];
            j++;
        }else if(arr1[i] < arr2[j]){
            arr1[i] = arr1[i];
            i++;
        }
    }
        while(i<n){
            arr1[i] = arr1[i++];
        }

        while (j < m) {
            arr1[i] = arr2[j++]; 
        }

        return arr1;
    }
    public static void main(String[] args) {
        int[] a = {12,33,53,75};
        int[] b = {10,40,62,81};

        
        int[] result = mergeTwoArray(a, b);
        for(int print : result){
            System.out.print(print+ " ");
        }

        // int[] result = merging(a, b);
        // for (int i : result) {
        //     System.out.print(i+" ");
        // }
    }

}
// NOTE : bhul mt jana remaining arr1 ki value ko store krna . line 27 and 31 dhyan rakhna