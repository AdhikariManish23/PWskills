package chapter01_Array.single_Dimension;
import java.util.Arrays;
// find the Duplicate Element from the Given Array

public class duplicateNumber {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,7,9,2};
        int n = arr.length;
        int ans = -1;  // default if we dont find any duplicate Number
        
        Arrays.sort(arr); // this help in to run the below Condittion {2,2,3,4,5,6,7,9}   

        for(int i = 1; i < n; i++){
            if(arr[i] == arr[i-1]){
                ans = arr[i];
                break;  // break isliye taaki code pura run naa kre or agar dupicate starting mai he hai toh wahi ruk jaye 
            }
        }
        System.out.println(ans);
    }
}
