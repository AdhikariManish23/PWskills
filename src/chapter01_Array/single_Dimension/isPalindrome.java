package chapter01_Array.single_Dimension;

// Question : If an array arr contains n elements, then check if the given array is a palindrome or not .
// this code is  only work for Int values .
public class isPalindrome {
    public static boolean palindromeOrNot(int[] arr){
        int s  = 0;
        int e = arr.length-1;

        while(s <= e){
            if(arr[s] == arr[e]){
                s++;
                e--;
            }else{
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,3,2,1};
       
        
        if(palindromeOrNot(arr)){
            System.out.println("It is palidorme ");
        }else{
            System.out.println("not Palindrome");
        }
    }
}
