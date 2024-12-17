package chapter02_Hash.sets;

import java.util.HashSet;

public class set_Iterate {
    public static void main(String[] args) {
        int[] arr = { 4, 5, 7, 7, 32, 9 };
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();

        HashSet<Integer> set = new HashSet<>();
        set.add(20);
        set.add(100);
        set.add(54);
        set.add(86);
        set.add(93);

        for (int p : set) {
            System.out.print(p + " ");
            // set.add(23) during the iteration we cant remove or add any element in the set
        }
        System.out.println();
        // to remove all the element we used set.clear()
        set.clear();
        for (int p : set) {
            System.out.print(p + " ");
        }
    }
}
