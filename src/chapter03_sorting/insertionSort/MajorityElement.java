package chapter03_sorting.insertionSort;

// import java.util.Arrays;

public class MajorityElement {
    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void main(String[] args) {
        // Majority Element is mus to be n/2
        // in below example
        int[] arr = { 1, 2, 3, 3, 1, 3, 2, 2, 3, 3 };
        int n = arr.length;

        // Using For Loop

        for (int i = 1; i < n; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1); // Swap if arr[j] is greater
                } else {
                    break; // break is important because if the arr[j] < arr[i] so there is no need to
                           // compare with other sorted element.
                }
            }
        }
        System.out.println(arr[arr.length / 2]);

        // // In Built Function (more optimised)
        // Arrays.sort(arr);
        // System.out.println(arr[arr.length / 2]);
    }
}
