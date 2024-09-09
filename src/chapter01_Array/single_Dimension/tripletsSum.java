package chapter01_Array.single_Dimension;



// Question: Count the number of triplets whose sum is equal to the given value x.

public class tripletsSum {
    public static int countOfTripletsSum(int[] arr, int target) {
        int count = 0;
       
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                for (int k = j + 1; k < arr.length; k++) {
            
                    if (arr[i] + arr[j] + arr[k] == target) {
                        count++;
                    }
                }
            }
        }

        return count;
    }


//  Optimised CODE :  

    // public static int countOfTripletsSum(int[] arr, int target) {
    //     int count = 0;
        
    //     // Sort the array to use two-pointer technique
    //     Arrays.sort(arr);

    //     // Iterate through the array, fixing one element at a time
    //     for (int i = 0; i < arr.length - 2; i++) {
    //         int left = i + 1;
    //         int right = arr.length - 1;

    //         // Use two pointers to find pairs that sum up with arr[i] to target
    //         while (left < right) {
    //             int currentSum = arr[i] + arr[left] + arr[right];

    //             if (currentSum == target) {
    //                 count++;
    //                 left++;
    //                 right--;
    //             } else if (currentSum < target) {
    //                 left++;  // Move the left pointer to increase the sum
    //             } else {
    //                 right--; // Move the right pointer to decrease the sum
    //             }
    //         }
    //     }

    //     return count;
    // }

    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 2, 3, 8, 5};
        int target = 10;
        
        // Output the number of triplets whose sum is equal to the target
        System.out.println("Number of triplets: " + countOfTripletsSum(arr, target)); 
    }
}