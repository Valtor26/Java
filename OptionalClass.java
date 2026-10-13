/*
    In Java, the Optional class (introduced in Java 8) is a container that may or may not contain a value. It's mainly used to handle situations where a value might be missing, helping reduce unexpected NullPointerExceptions.
*/


import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalClass {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Abhishek","Vishal","Rahul","Ansh");

        Optional<String> name = names.stream()
                      .filter(str -> str.contains("hi"))
                      .findFirst();

        System.out.println(name.orElse("Not found"));
    }
}
