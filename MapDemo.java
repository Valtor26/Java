/*
    HashMap: A map that uses a hash table to store the key-value pairs

    HashTable: A data structure that uses a hash function to map keys to values, its synchronized 
*/



import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer, String> mp = new HashMap<Integer, String>();

        mp.put(400,"Abhishek");
        mp.put(401,"Advick");
        mp.put(402,"Anitha");

        for(int i : mp.keySet()){
            System.out.println(i + " : " + mp.get(i));
        }
    }
}
