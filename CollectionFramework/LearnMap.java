package CollectionFramework;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class LearnMap {
    public static void main(String[] args) {
        // Map<String,Integer> mp = new HashMap<>(); // stores the key in random manner

        Map<String,Integer> mp = new TreeMap<>(); // stores the key in sorted manner

        mp.put("One", 1);
        mp.put("Two", 2);
        mp.put("Three", 3);
        mp.put("Four", 4);
        mp.put("Five", 5);

        // mp.put("Two", 23); ------->// overrides the previous value

        if(!mp.containsKey("Two")){ // add the element only if the key is not present
            mp.put("Two", 23);
        }

        System.out.println(mp.containsValue(5)); // returns true if value is present or else false

        mp.putIfAbsent("Two", 24); // same as above condition

        System.out.println(mp);


        for(Map.Entry<String,Integer> e : mp.entrySet()){
            System.out.println(e);
        }

        for(String keys : mp.keySet()){ // iterate over the keys
            System.out.println(keys);
        }

        for(Integer val : mp.values()){ // iterate over the values
            System.out.println(val);
        }

        System.out.println(mp.isEmpty()); // returns true if the map is empty or false

        mp.remove("Three"); // removes the key and value

        mp.clear(); // clears the map
    }
}
