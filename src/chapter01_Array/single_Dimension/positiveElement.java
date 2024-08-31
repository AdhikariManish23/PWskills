package chapter01_Array.single_Dimension;

// Find the smallest missing positive Element in the sorted Array.
// Input = {1,2,3,4,6,7,8}
// Output= 5

public class positiveElement {
    
    public static void main(String[] args) {
    //  int[] arr = {-3, -2, -1, 0, 1, 2, 4, 5, 6, 7, 8};
        int[] arr = {1,2,3,5,6}; 
        int ans =1;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == ans){
                ans++;
            }
        }
        System.out.println(ans);
    }
    
}
// NOTE : This is not the Optimised Approach 