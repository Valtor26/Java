import java.util.ArrayList;
import java.util.List;

public class ForEachLoop {
    public static void main(String[] args) {
        List<Integer> ls = new ArrayList<>();

        ls.add(10);
        ls.add(20);
        ls.add(30);
        ls.add(40);


        // Method 1: for loop
        System.out.println("Method 1");
        for(int i=0;i<ls.size();i++){
            System.out.println(ls.get(i));
        }

        // Method 2: for each loop
        System.out.println("Method 2");
        for(int i : ls){
            System.out.println(i);
        }

        // Method 3: for each loop with lambda expression
        System.out.println("Method 3");
        ls.forEach(n -> System.out.println(n));
    }
}
