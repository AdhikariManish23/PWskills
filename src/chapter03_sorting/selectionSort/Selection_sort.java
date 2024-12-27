package chapter03_sorting.selectionSort;

public class Selection_sort {
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
        int[] arr = { 4, 3, 6, 9, 2, 1 };
        int n = arr.length;
        print(arr);

        for (int i = 0; i < n - 1; i++) {
            int min = i; // Assume the first element is the smallest
            for (int j = i + 1; j < n; j++) {
                if (arr[min] > arr[j]) { // Find the actual smallest element
                    min = j;
                }
            }
            swap(arr, min, i); // Swap the smallest element with the current element
        }

        print(arr);
    }
}
