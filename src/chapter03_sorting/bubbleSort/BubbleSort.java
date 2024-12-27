package chapter03_sorting.bubbleSort;

public class BubbleSort {
    public static void print(int[] arr) {
        for (int print : arr) {
            System.out.print(print + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 3, 2, 5, 4, 11 };
        int n = arr.length;
        print(arr);

        // Method 1: this code will sort some unsorted array
        // for (int i = 0; i < n - 1; i++) {
        // if (arr[i] > arr[i + 1]) {
        // int temp = arr[i];
        // arr[i] = arr[i + 1];
        // arr[i + 1] = temp;
        // }
        // }
        // print(arr);

        // Method 2:
        // for (int i = 0; i <= n - 1; i++) { // n-1 passes lagenge kissi bhi array ko
        // sort krne ke
        // for (int j = 0; j < n - 1; j++) {
        // if (arr[j] > arr[j + 1]) {
        // int temp = arr[j];
        // arr[j] = arr[j + 1];
        // arr[j + 1] = temp;
        // }
        // }
        // }
        // print(arr);

        // Method 3: there is no need of inner loop to check the sorted element
        // for (int i = 0; i < n - 1; i++) { // n = 5 here, so the outer loop will run
        // n-2 iteration array will be sort
        // for (int j = 0; j < n-1-i; j++) { // n-1-i there is no need to check the last
        // element because it automatically sorted
        // if (arr[j] > arr[j + 1]) {
        // int temp = arr[j];
        // arr[j] = arr[j + 1];
        // arr[j + 1] = temp;
        // }
        // }
        // }
        // print(arr);

        // Method 4: Optimised code
        for (int i = 0; i < n - 1; i++) {
            boolean flag = true;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = false;
                }
            }
            if (flag == true)
                break;
        }
        print(arr);
    }
}

// all this give same time complexity is O(n2);