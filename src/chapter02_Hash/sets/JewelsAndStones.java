package chapter02_Hash.sets;

import java.util.HashSet;

/*  Yeh question aapko do strings de raha hai: jewels aur stones.

Jewels string mein wo stones hain jo jewels hain (e.g., aapke paas jo precious stones hain).
Stones string mein wo stones hain jo aapke paas hain (e.g., aapke paas kaunsa stone hai).
Aapko yeh pata karna hai ki jo stones aapke paas hain, unmein se kitne jewels hain.

(All the characters of jewels are unique.)

Input : Jewels = "aA"  ,Stones = "aAAbbbb" 
Output : 3 
*/
public class JewelsAndStones {
    public static void main(String[] args) {
        String Jewels = "aA";
        String stones = "aAAbbb";

        HashSet<Character> set = new HashSet<>();

        for (char ch : Jewels.toCharArray()) {
            set.add(ch);
        }

        int count = 0;
        for (char ch1 : stones.toCharArray()) {
            if (set.contains(ch1)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
