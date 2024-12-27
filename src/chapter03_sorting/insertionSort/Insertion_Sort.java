package chapter03_sorting.insertionSort;

import java.util.Arrays;

public class Insertion_Sort {
    public static void print(int[] arr) {
        for (int print : arr) {
            System.out.print(print + " ");
        }
        System.out.println();
    }

    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 5, 1, 4, 2 };
        int n = arr.length;
        print(arr);

        for (int i = 1; i < n; i++) { // Start from the second element
            int key = arr[i];
            int j = i - 1;

            // Shift elements of arr[0..i-1] that are greater than key
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key; // Place the key in its correct position
        }

        print(arr);
    }
}
