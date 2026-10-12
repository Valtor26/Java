import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CollectionInterfaceDemo {
    public static void main(String[] args) {
        // Collection nums = new ArrayList();

        // nums.add(1);    
        // nums.add(2);
        // nums.add(3);
        
        // System.out.println(nums.size());
        // System.out.println(nums.contains(2));
        // System.out.println(nums.contains(4));

        // System.out.println(nums);


        // Collection<Integer> arr = new ArrayList<Integer>();
        // arr.add(1);
        // arr.add(2);
        // arr.add(3);

        // System.out.println(arr.size());
        // System.out.println(arr.contains(2));
        // System.out.println(arr.contains(4));

        // System.out.println(arr);
        

        // List<Integer> arr = new ArrayList<Integer>(); // ArrayList is a collection that allows duplicate elements
        // arr.add(1);
        // arr.add(2);
        // arr.add(3);
        // arr.add(3);

        // System.out.println(arr.get(0));
        // System.out.println(arr.size());


        // Set<Integer> s1 = new HashSet<Integer>(); // HashSet is a collection that does not allow duplicate elements and the elements are not sorted

        // s1.add(9);
        // s1.add(62);
        // s1.add(54);
        // s1.add(1);
        // s1.add(2);
        // s1.add(3);
        // s1.add(3);
        // s1.add(440);
        // s1.add(4);
        // s1.add(5);
        // s1.add(5);

        //  for(int i : s1){
        //     System.out.println(i);
        //  }




        Set<Integer> s2 = new TreeSet<Integer>(); // TreeSet is a collection that does not allow duplicate elements and the elements are sorted
        s2.add(9);
        s2.add(62);
        s2.add(54);
        s2.add(1);
        s2.add(2);
        s2.add(3);
        s2.add(3);  

        for(int i : s2){
            System.out.println(i);
         }



         // Iterator: An interface for traversing the elements of a collection
         Iterator<Integer> it = s2.iterator();
         while(it.hasNext()){
             System.out.println(it.next());
         }
        
    }
}
