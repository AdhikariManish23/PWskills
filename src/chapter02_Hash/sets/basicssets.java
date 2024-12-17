package chapter02_Hash.sets;

import java.util.HashSet;

public class basicssets {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        // Inserting an element gives Time Complexity = O(1)
        set.add(20);
        set.add(100);
        set.add(10);
        System.out.println("Size of set is :" + set.size());
        set.add(-8);
        set.add(200);
        // 1 : set is always print in random way

        System.out.println(set);

        // 2: search - true/false Time Complexity = O(1)
        System.out.println(set.contains(10)); // this will give you that number is present or not(true/false)
        System.out.println(set.contains(50)); // false
        set.add(50);
        System.out.println(set.contains(50));
        System.out.println("Size of set is :" + set.size());

        // 3: remove an element
        System.out.println("Current set :" + set);
        set.remove(100);
        System.out.println("After removing an element :" + set);

        // 4: in set if we want to remove / search the unexisting element so it will not
        // give ERROR

        // 5: Converting set into array
        Object[] arr = set.toArray(); // make sure to create arr as an OBJECT
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
