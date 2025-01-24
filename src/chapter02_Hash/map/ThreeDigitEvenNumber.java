package chapter02_Hash.map;

import java.util.ArrayList;
import java.util.HashMap;

//  Leetcode : 2094

public class ThreeDigitEvenNumber {
    public static int[] findEvenNumber(int[] arr) {
        // Storing all the element in the HashMap With their Frequencies
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                int freq = map.get(arr[i]);
                map.put(arr[i], freq + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        // Now we create a new array list to store answers
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 100; i < 999; i += 2) {
            int x = i; // make copy of i we cant change the iteration
            int c = x % 10;
            x /= 10; // with this we can separate each number
            int b = x % 10;
            x /= 10;
            int a = x;

            if (map.containsKey(a)) {
                int aFreq = map.get(a);
                map.put(a, aFreq - 1); // agar element ki freq 1 se jyada hai toh a per vo ek baar use ho chuka hai toh
                                       // uski freq kam kro
                if (aFreq == 1)
                    map.remove(a); // agar freq 1 he hai toh uss element ko remove kr do map se taaki phir se use
                                   // naah ho vo

                if (map.containsKey(b)) {
                    int bFreq = map.get(b);
                    map.put(b, bFreq - 1);
                    if (bFreq == 1)
                        map.remove(b);

                    if (map.containsKey(c)) {
                        ans.add(i);
                    }

                    map.put(b, bFreq); // restore the actual frequency
                }
                map.put(a, aFreq);// restore the actual frequency
            }
        }

        // Convert the ArrayList to an int[] and return it
        int[] ans2 = new int[ans.size()];
        for (int i = 0; i < ans2.length; i++) {
            ans2[i] = ans.get(i); // yeah ArrayList ka get hai
        }
        return ans2;
    }

    public static void main(String[] args) {
        int[] arr = { 4, 6, 7 };
        int[] output = findEvenNumber(arr);

        // Print the result
        for (int num : output) {
            System.out.println(num);
        }
    }
}