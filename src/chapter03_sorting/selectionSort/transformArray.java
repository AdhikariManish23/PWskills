package chapter03_sorting.selectionSort;

public class transformArray {
    public static void print(int[] arr) {
        for (int print : arr) {
            System.out.print(print + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = { 35, 76, 3, 43, 5, 54, 64, 44 };
        // Output = 2, 7, 0, 3, 1, 5, 6, 4
        int n = arr.length;
        print(arr);
        int x = 0; // If x were initialized inside the loop, its value would reset to 0 at the
                   // start of every iteration.
        for (int i = 0; i < n; i++) {
            int min = Integer.MAX_VALUE;
            int mindx = -1; // ensures that no invalid index is assumed before the inner loop runs.
            for (int j = 0; j < n; j++) {
                if (arr[j] < min && arr[j] > 0) {
                    min = arr[j];
                    mindx = j;
                }
            }
            arr[mindx] = x;
            x--;
        }
        for (int i = 0; i < n; i++) {
            arr[i] *= (-1);
        }
        print(arr);
    }
}
