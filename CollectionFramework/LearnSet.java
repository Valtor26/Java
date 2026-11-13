package CollectionFramework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {
    public static void main(String[] args) {
        // Set<Integer> st = new HashSet<>(); ------> // set doesnt allow duplicate elements, it uses hashing to store the elements, same hash results in duplicate value which is discarded by the set,  the elements are stored in random manner

        // Set<Integer> st = new LinkedHashSet<>(); ----> // it doesnt allow duplicates, but the elements are stored in order you add them

        Set<Integer> st = new TreeSet<>(); // it doesnt allow duplicates, but the elements are stored in sorted order

        st.add(10);
        st.add(99);
        st.add(10);
        st.add(45);
        st.add(66);
        st.add(20);
        st.add(10);


        System.out.println(st);

        st.remove(20); // remove 20 from the set

        System.out.println(st);
        
    }
}
