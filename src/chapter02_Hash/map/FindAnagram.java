package chapter02_Hash.map;

import java.util.HashMap;

public class FindAnagram {

    public static boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> smap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char key = s.charAt(i);
            if (smap.containsKey(key)) {
                int freq = smap.get(key);
                smap.put(key, freq + 1);
            } else
                smap.put(key, 1);
        }
        HashMap<Character, Integer> tmap = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            char key = t.charAt(i);
            if (tmap.containsKey(key)) {
                int freq = tmap.get(key);
                tmap.put(key, freq + 1);
            } else
                tmap.put(key, 1);
        }

        for (char key : smap.keySet()) {

            if (!tmap.containsKey(key))
                return false;// Agar tmap ke andar yeh character (key) nahi hai, toh seedha false return kar
                             // do.
            int val1 = tmap.get(key); // before tmap.get(key) the above condition is important to check wether the key
                                      // is present or not in the tmap
            int val2 = smap.get(key);
            if (val1 != val2)
                return false;
        }
        return true;

    }

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";

        System.out.println(isAnagram(s, t));
    }
}

/*
 * NOTES :
 * methods saare ptaa hone chaiye ki kisse kya hota hai kiss se kya value milti
 * hai
 * humne 2 hash map liye jisme humne (key , freq) store krayi hai
 * baad mai kissi bhi hashmap per traverse kr k compare krayi 2 condtion
 * 1. ki tmap mai smap ki key hai ki nhi hai
 * 2. agar key hai toh dono key ki freq same hai ki nhi
 * 
 */