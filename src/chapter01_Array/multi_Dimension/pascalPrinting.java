package chapter01_Array.multi_Dimension;

import java.util.ArrayList;
import java.util.Scanner;

public class pascalPrinting {

    public static ArrayList<ArrayList<Integer>> generate(int n){
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            ArrayList<Integer> l = new ArrayList<>();

            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) l.add(1);
                 else {
                    l.add(ans.get(i - 1).get(j) + ans.get(i - 1).get(j - 1)); 
                }
            }
            ans.add(l);
        }
        return ans;
    }
    public static void main(String[] args) {
        
//  Brute Force :

        System.out.println("Enter the value of Pascal Pattern :");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        for(int i = 0; i < n; i++){
            ArrayList<Integer> l = new ArrayList<>();

            for(int j = 0; j <= i; j++){
                l.add(1);
            }
            ans.add(l);
        }
        
        for(int i = 2; i <n; i++){
            for(int j = 1; j< i; j++){
                ans.get(i).set(j, ans.get(i-1).get(j) + ans.get(i-1).get(j-1));
            }
        }
        
        System.out.println(ans);
        


        System.out.println();
//  Optimised Code 
        System.out.println("Enter the value for the Optimised Code : ");
        int m = sc.nextInt();
        System.out.println(generate(m));

        sc.close();
    }
}
