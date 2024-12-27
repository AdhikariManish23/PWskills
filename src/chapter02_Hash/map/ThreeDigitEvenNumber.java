package chapter02_Hash.map;

import java.util.ArrayList;
import java.util.HashMap;

//  Leetcode : 2094

public class ThreeDigitEvenNumber {
    public static int[] findEvenNumber(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int ele : arr) {
            if (map.containsKey(ele)) {
                int freq = map.get(ele);
                map.put(ele, freq + 1);
            } else {
                map.put(ele, 1);
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 100; i <= 999; i += 2) {
            int x = i;
            int c = x % 10;
            x /= 10;
            int b = x % 10;
            x /= 10;
            int a = x;

            if (map.containsKey(a)) { // checking that in the map 'a' element is present or not
                int aFreq = map.get(a); // and also checking the frequency of the element
                map.put(a, aFreq - 1);
                if (aFreq == 1)
                    map.remove(a); // agar element ki frequency 1 hojati hai toh usko remove kr do iska matlab vo
                                   // use ho chukaa hai

                if (map.containsKey(b)) {
                    int bFreq = map.get(b); // and also checking the frequency of the element
                    map.put(b, bFreq - 1);
                    if (bFreq == 1)
                        map.remove(b);

                    if (map.containsKey(c)) {
                        int cFreq = map.get(c); // and also checking the frequency of the element
                        map.put(c, cFreq - 1);
                        if (cFreq == 1)
                            map.remove(c);
                    }
                    map.put(b, bFreq);
                }
                map.put(a, aFreq);
            }
        }
        int[] ans2 = new int[ans.size()];
        for (int i = 0; i < ans2.length; i++) {
            ans2[i] = ans.get(i);
        }
        return ans2;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 0, 4, 6, 7 };
        int[] output = findEvenNumber(arr);

        // Print the result
        for (int num : output) {
            System.out.println(num);
        }
    }
}