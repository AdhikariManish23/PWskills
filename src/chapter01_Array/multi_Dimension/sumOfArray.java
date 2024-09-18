package chapter01_Array.multi_Dimension;

public class sumOfArray {
    public static int add(int[][] arr){
        int ans = 0;
        for(int i = 0 ; i < arr.length; i++){
            for(int j = 0 ; j < arr.length; j++){
                ans += arr[i][j];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] arr = {{1,2,3} , {4,5,6}, {7,8,9}};
        System.out.println(add(arr));
    }
}
