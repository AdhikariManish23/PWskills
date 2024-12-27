package chapter02_Hash.map;

import java.util.HashMap;
import java.util.HashSet;

// input = {1,2,2,1,1,3};
// output= true;
public class UniqueOccurence {
    public static boolean occuerencess(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                int freq = map.get(arr[i]);
                map.put(arr[i], freq + 1);
            } else {
                map.put(arr[i], 1);
            }
        }

        HashSet<Integer> set = new HashSet<>();
        for (Integer key : map.keySet()) {
            int val = map.get(key);
            set.add(val);
        }

        return (map.size() == set.size());

    }

    public static void main(String[] args) {
        int[] arr = { 2, 2, 1, 2, 3, 3 };

        System.out.println(occuerencess(arr));
        // HashMap<Integer, Integer> map = new HashMap<>();

        // for (int i = 0; i < arr.length; i++) {
        // if (map.containsKey(arr[i])) {
        // int freq = map.get(arr[i]);
        // map.put(arr[i], freq + 1);
        // } else {
        // map.put(arr[i], 1);
        // }
        // }

        // System.out.println(map);
        // }
    }
}