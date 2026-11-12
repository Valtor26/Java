// ArrayList: it dynamically increases or decreases its own size, if automatically creates a new array of size (n + n/2 + 1) and copies the old elements into it

package CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LearnArrayList {
    public static void main(String[] args) {
        List<Integer> ls = new ArrayList<>();
        ls.add(1);
        ls.add(2);
        ls.add(3);
        System.out.println(ls);

        ls.add(4);
        System.out.println(ls);

        ls.addFirst(8); // insert 8 at the first index ie 0
        System.out.println(ls);

        ls.add(3, 50); // add 50 at the 3rd index
        System.out.println(ls);

        System.out.println(ls.get(0));

        List<Integer> newList = new ArrayList<>();
        newList.add(99);
        newList.addAll(ls); // add a list to another list

        System.out.println(newList);

        ls.remove(0);

        ls.remove(Integer.valueOf(4)); // Remove the element 4

        System.out.println(ls);

        ls.set(0, 100); // update the value at index 0
        System.out.println(ls);

        System.out.println(ls.contains(100)); // return true if 100 is present else false


        // Iterator

        Iterator<Integer> it = ls.iterator();

        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }

    }
}
