package chapter01_Array.single_Dimension;

// Calculate the product of all the elements in the given Array

public class productOfAllElement {
    public static void main(String[] args) {
        int[] arr = {2,2,2,2,};
        int ans = 1;
        for(int i = 0; i <arr.length; i++){
            ans *= arr[i];
        }

        System.out.println(ans);
    }

}
