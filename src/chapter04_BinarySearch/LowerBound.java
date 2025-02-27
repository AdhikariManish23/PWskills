package chapter04_BinarySearch;

/*
 * 1 : x present hai 
 *      input = [1,2,4,4,6,8],  x = 4
 * LowerBound = 4 ka phela occurence inbdex 2 hai -> answer: 2
 * 
 * 2 : x missing hai 
 *      input = [1,2,4,4,6,8], x = 5
 * LowerBound = 5 array mai nhi hai , per 5 se bada phela element 6 aahi jiska index 4 hai -> answer: 4
 * 
 * 3 : x bada hai saare elements se
 *      input = [1,2,4,4,6,8], x = 10;
 * LowerBound = 10 se bada koi element nahi hai -> answer: 6 (array k size k barabar)        
 */

public class LowerBound {
    public static int findLowerBound(int[] arr, int target) {
        int n = arr.length;
        int lb = n;
        int s = 0, e = n - 1;

        while (s <= e) {
            int mid = (s + e) / 2;
            if (arr[mid] >= target) {   
                lb = Math.min(mid, lb);
                e = mid - 1;
            } else
                s = mid + 1;
        }
        return lb;
    }

    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 30, 40, 50, 60, 70 };
        int target = 4;
        System.out.println(findLowerBound(arr, target));

    }
}
