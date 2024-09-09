package chapter01_Array.single_Dimension;

// Quesiton : Find the unique number in a given Array where all the elements are being repeated twice with one value being unique.
                
public class uniqueNumber {
    public static int findUniqueNumber(int[] arr){
        int ans = 0;
        for(int i =0 ; i <arr.length; i++){
            ans ^= arr[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 4, 8, 5, 3, 4,2};  // Example array
        System.out.println("Unique number is: " + findUniqueNumber(arr));  // Output: 2

    }
}
