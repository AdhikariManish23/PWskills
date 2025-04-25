package chapter01_Array.single_Dimension;

//Question :  Check if Array Is Sorted and Rotated

public class checkArraySorted {
    public static boolean isSorted(int[] arr) {

        int n = arr.length;
        int count = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i - 1] > arr[i]) {
                count++;
            }
        }
        if (arr[n - 1] > arr[0])
            count++;

        return count <= 1;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 4, 5, 1, 2 };

        System.out.println(isSorted(arr));
        // if (isSorted(arr)) {
        // System.out.println("Array is Sorted ");
        // } else {
        // System.out.println("Array is NOT Sorted");
        // }
    }
}
