/*
    Comparator: An interface that compares two objects and returns a value that indicates their relative order by using the logic specified by the user

    return 1: swap the two objects
    return -1: leave the two objects as they are
*/



import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {
    public static void main(String[] args) {

        Comparator<String> comp = new Comparator<String>() {
            
            public int compare(String s1, String s2) {
                if(s1.length() > s2.length()){
                    return 1;
                }
                else return -1;
            }
        };

        List<String> names = new ArrayList<>();

        names.add("Abhishek");
        names.add("Dews");
        names.add("Ak");
        names.add("Ankit");
        names.add("Ashish");
        names.add("Reo");
        names.add("Zack");


        Collections.sort(names, comp);

        System.out.println(names);
    }
}