/*
    A constructor reference is a shorthand for referring to a constructor using the ::new syntax. It was introduced in Java 8 and is used with functional interfaces, often alongside lambda expressions and the Stream API.
*/

import java.util.Arrays;
import java.util.List;

class Student{
    private String name;
    private int age;
    public Student(String name) {
        this.name = name;
    }
    public Student() {
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }

}



public class ConstructorRef {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Abhishek","Vishal","Rahul");

        List<Student> studs = names.stream()
                            //   .map(name -> new Student(name))
                              .map(Student::new)
                              .toList();

        System.out.println(studs);
    }
}
