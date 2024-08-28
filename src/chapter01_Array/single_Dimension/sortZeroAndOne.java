package chapter01_Array.single_Dimension;

public class sortZeroAndOne {
    
    public static void sortarray(int[] arr){
        int i = 0;
        int j = arr.length -1;
        while(i < j){
            if(arr[i] == 0) i++;
            else if(arr[j] == 1) j--;
            else{
                arr[i] = 0;
                arr[j] = 1;
                i++;
                j--;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {0,0,0,1,1,1};
        
        sortarray(arr);

        for(int result : arr){
            System.out.print(result+" ");
        }
    }
}
