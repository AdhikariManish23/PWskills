package chapter01_Array.single_Dimension;

// Question: Sort the array of 0's , 1's and 2's. (Dutch Flag Algo)
// input = {1,0,2,0,1,2,1,0,0,1,2}
// output = {0,0,0,0,1,1,1,1,2,2,2}

public class colorsSort {
    public static void swap(int[] arr,int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    } 

    public static void sortingColors(int[] arr){
        int n = arr.length;
        int low = 0;
        int mid = 0;
        int high = n-1;

        while (mid <= high) {
            if(arr[mid]== 0){
                swap(arr, mid, low);
                mid++;
                low++;
            }
            else if(arr[mid] == 1){
                mid++;
            }
            else{ // arr[mid]  == 2

                swap(arr, mid, high);
                high--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,0,2,0,1,2,1,0,0,1,2};
        sortingColors(arr);

        for(int i = 0; i< arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}

// You can also do this code With Brute Force 