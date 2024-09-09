package chapter01_Array.single_Dimension;

// Question : Find the first non-repeating element in the array.

public class firstNonRepeatingElement {
        public static int nonRepeating(int[] arr){
            int ans = 0;
            for(int i =0; i < arr.length -1; i++){
                for(int j = i+1; j <arr.length; j++){
                    if(arr[i] != arr[j]){
                        break;
                    }
                } 
            }
            return ans;
        }

        public static void main(String[] args) {
            int[] arr = {4, 5, 1, 2, 0, 4};
            System.out.println(nonRepeating(arr));
        }
}
