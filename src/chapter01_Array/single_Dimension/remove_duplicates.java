package chapter01_Array.single_Dimension;

import java.util.Arrays;

// Remove Duplicates from Sorted Array

public class remove_duplicates {
    // It return the unique element count

    // public static int removeDuplicates(int[] arr) {
    // int n = arr.length;
    // if (n == 0)
    // return 0; // Handle empty array case

    // int index = 1; // Points to the position where the next unique element should
    // be placed

    // for (int i = 0; i < n - 1; i++) {
    // if (arr[i] < arr[i + 1]) { // Found a new unique element
    // arr[index] = arr[i + 1]; // Store the unique element in the next available
    // position
    // index++;
    // }
    // }
    // return index;
    // }

    // It return the new array with unique element

    public static int[] removeDuplicates(int[] arr) {
        int n = arr.length;
        if (n == 0)
            return new int[0]; // Return an empty array if input is empty

        int index = 1; // Points to the position where the next unique element should be placed

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] < arr[i + 1]) { // Found a new unique element
                arr[index] = arr[i + 1]; // Store the unique element in the next available position
                index++;
            }
        }

        // Create a new array with only unique elements
        return Arrays.copyOf(arr, index);
    }

    public static void main(String[] args) {
        int[] arr = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        System.out.println(removeDuplicates(arr));
        int[] uniqueArr = removeDuplicates(arr);

        System.out.println(Arrays.toString(uniqueArr)); // Print the unique elements array
    }
}
