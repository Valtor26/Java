/*
Stream api: A powerful and flexible API for processing collections of data.

The Stream API in Java is used to process collections of data in a clean, declarative way. It was introduced in Java 8 and is useful for filtering, transforming, sorting, and aggregating data.

*/


import java.util.Arrays;
import java.util.List;


public class StreamApiDemo {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        // Stream<Integer> s1 = nums.stream();

        // s1.forEach(n -> System.out.println(n*2));
        // s1.forEach(n -> System.out.println(n*2)); // a stream cannot be reused


        // Stream<Integer> s2 = s1.filter(n -> n%2 == 0);
        // Stream<Integer> s3 = s2.map(n -> n*2);
        // Integer s4 = s3.reduce(0,(c,e)-> c+e);

        // System.out.println(s4);
        // s3.forEach(n -> System.out.println(n));



        int result = nums.stream()
                    .filter(n->n%2==0)
                    .map(n->n*2)
                    .reduce(0,(c,e)->c+e);


        System.out.println(result);
    }
}
