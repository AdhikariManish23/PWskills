package chapter01_Array.single_Dimension;

// Question 1 : Find the difference between the sum of elements at even indices to the sum of elements at odd indices.
// Question 2 : Given an array of integers, change the value of all odd indexed elements to its second multiple and increment all even indexed values by 10.

public class evenAndoddIndices {
//  Method For Question 1 : 
    public static int sumEvenOdd(int[] arr){
        int sumEven = 0;
        int sumOdd = 0;
    
        for(int i = 0; i < arr.length; i++){
            // for even 
            if( i % 2 == 0){
                sumEven += arr[i];
            }
            // for odd
            else{
                sumOdd += arr[i];
            }
        }

        return sumEven - sumOdd;
    }

// Method For Question 2:    
    public static void  changeEvenAndOddValues(int[] arr){
        for(int i = 0; i < arr.length; i++){

            if(i % 2 == 0){
                arr[i] = arr[i] + 10;
            }
            else{
                arr[i] = arr[i] * 2;
            }
        }
    }


    public static void main(String[] args) {
        // Question 1:
        System.out.println("Given Array : ");
        int[] arr = {1,2,3,4,5,6,7,8};
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("Difference Of Even And Odd Indices : "+sumEvenOdd(arr));
        System.out.println();
       
       
        // Question 2:
        System.out.println("Array before Changing : ");
        int[] nums = {10,2,20,3,40,5,60};
        for (int i : nums) {
            System.out.print(i+" ");
        }
        System.out.println();
        changeEvenAndOddValues(arr);
        System.out.println("Array After Changes : ");
        for (int i : nums) {
            System.out.print(i+" ");
        }

    }

}
