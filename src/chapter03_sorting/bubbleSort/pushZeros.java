package chapter03_sorting.bubbleSort;

// Question : push the zeros to the end while maintaining the relative order of other element
// Leetcode 283

public class pushZeros {
    public static void print(int[] arr) {
        for (int print : arr) {
            System.out.print(print + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 0, 1, 0, 3, 12 };
        int n = arr.length;

        // this portion will help it to more optimised
        int numZeros = 0;
        for (int ele : arr) {
            if (ele == 0)
                numZeros++;
        }

        for (int i = 0; i < numZeros; i++) { // n = 5 here, so the outer loop will run n-2 iteration array will be sort
            for (int j = 0; j < n - 1 - i; j++) { // n-1-i there is no need to check the last element because it
                                                  // automatically sorted
                if (arr[j] == 0) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        print(arr);
    }
}
