package chapter02_Hash.map;

import java.util.HashMap;

public class map_iterate {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("raju", 32);
        map.put("himanshu", 56);
        map.put("leena", 45);
        map.put("kamlesh", 32);
        map.put("seema", 12);

        // this will print only the Keys of Map
        for (String key : map.keySet()) {
            System.out.println(key);
        }

        System.out.println();
        // this will print keys along with the values
        for (String key : map.keySet()) {
            int val = map.get(key);
            System.out.println(key + " " + val);
        }

        System.out.println();

        // it only prints values
        for (int val : map.values()) {
            System.out.println(val);
        }
    }
}
