/*
    Method references are a way to pass a method as an argument to another method. They are useful when you want to pass a method as a parameter to another method, but you don't want to define the method inline.

    We have to specify where the method is defined. We can do this by using the :: operator.
*/


import java.util.Arrays;
import java.util.List;

public class MethodRef {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Abhishek","Vishal","Rahul");

        List<String> uNames = names.stream()
                            //   .map(name -> name.toUpperCase())
                              .map(String::toUpperCase)
                              .toList(); // create a new list

        // System.out.println(uNames);

        uNames.forEach(System.out::println);
    }
}
