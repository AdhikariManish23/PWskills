package chapter01_Array.single_Dimension;

//Question : check if the given array is sorted or not

public class checkArraySorted {
    public static boolean isSorted(int[] arr){
        
        for(int i = 0 ; i< arr.length-1; i++){
             if (arr[i] > arr[i+1]) {
                return false;
             }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr ={2,40,6,7,8,9};
        if(isSorted(arr)){
            System.out.println("Array is Sorted ");
        }else{
            System.out.println("Array is NOT Sorted");
        }
    }
}
