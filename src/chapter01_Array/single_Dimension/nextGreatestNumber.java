package chapter01_Array.single_Dimension;
// Input => {12,8,41,37,2,49,16,28,21}

// output=> {49,49,49,49,49,28,28}
// Explanation

public class nextGreatestNumber {

    // OPRIMISED (Method)
    // In this method the loop is running Only 1 Time (ONE PASS)

    public static void main(String[] args) {
        int[] arr = { 12, 8, 41, 37, 2, 49, 16, 28, 21 };
        int n = arr.length;
        int[] ans = new int[n];

        ans[n - 1] = -1; // fill the last elemnt of answer array with -1; (because there is no number
                         // left to check the greatest when we are on the i = 0 )
        int nge = arr[n - 1]; // next greeatest element in this case it initiated with 21

        for (int i = n - 2; i >= 0; i--) {
            ans[i] = nge; // ans array mai last second digit per humne 21 daal diya
            nge = Math.max(nge, arr[i]); // phir nge ko update kra compare kr (nge,arr[i]) => (21,28) ;; arr[i] == to 28
                                         // i is starting with n-2.
        }

        for (int x : ans) {
            System.out.print(x + " ");
        }

    }

    // BRUTE FORCE (Method)
    // TWO PASS

    // public static void main(String[] args) {
    // int[] arr = {12,8,41,37,2,49,16,28,21};
    // int[] ans = new int[arr.length];
    // ans[arr.length-1] = -1;

    // for(int i = 0; i<arr.length-1; i++){
    // int max = Integer.MIN_VALUE;

    // for(int j = i+1; j < arr.length; j++){
    // max = Math.max(max,arr[j]);
    // }
    // ans[i] = max;
    // }

    // for(int print:ans){
    // System.out.print(print+" ");
    // }
    // }

}