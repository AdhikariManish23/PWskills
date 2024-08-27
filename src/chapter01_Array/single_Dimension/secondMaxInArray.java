package chapter01_Array.single_Dimension;

public class secondMaxInArray {
    public static void main(String[] args) {
        int[] arr = {13,27,63,74,95,40,32,80};
        int max = Integer.MIN_VALUE;         

        for(int i = 0; i< arr.length; i++){
            max = Math.max(max, arr[i]);
        }
        System.out.println("First Maximum Number : "+ max);
    
        int smx = Integer.MIN_VALUE;
        for(int i = 0; i< arr.length; i++){
            if(arr[i] != max){
                smx = Math.max(smx, arr[i]);
            }
        }
        System.out.println("Second Maximum Number : "+smx);
    }
}

// Integer.MIN_VALUE is a constant in Java that represents the smallest value that can be stored in a variable of type int. Its value is -2^31, which equals -2,147,483,648.  VICE-VERSA