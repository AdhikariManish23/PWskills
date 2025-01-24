package chapter02_Hash.map;

import java.util.HashMap;

public class basicMap {

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("raju", 32);
        map.put("himanshu", 56);
        map.put("leena", 45);
        map.put("kamlesh", 32);
        map.put("seema", 12);

        System.out.println(map);
        System.out.println(map.containsKey("leena"));
        System.out.println(map.containsValue(32));

        map.put("raju", 100); // it means there can be 2 or more keys with same values. But keys are UNIQUE
        System.out.println(map);
        System.out.println(map + "  " + map.size());
        map.remove("leena");
        System.out.println(map + "  " + map.size());

        System.out.println(map.get("seema")); // it gives the value of that key

    }
}
