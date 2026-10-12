/*
    `Comparable` vs `Comparator` in Java

- Comparable: An interface used to define the natural ordering of objects by implementing the `compareTo()` method inside the class itself. its like giving the power to the class to compare itself with other objects.
- Comparator: An interface used to define a custom ordering of objects by implementing the `compare()` method, usually in a separate class or with a lambda expression.

| Feature                | Comparable                    | Comparator                           |
| ---------------------- | ----------------------------- | ------------------------------------ |
| Package                | `java.lang`                   | `java.util`                          |
| Method                 | `compareTo(Object o)`         | `compare(Object o1, Object o2)`      |
| Sorting logic          | Inside the class being sorted | Separate from the class being sorted |
| Ordering               | Usually natural/default order | Custom ordering                      |
| Multiple sorting rules | Less convenient               | Easy to define multiple comparators  |

Example: Sorting students by their age using `Comparable`, or by their name using `Comparator`.
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student>{
    int age;
    String name;

    public Student(int age, String name){
        this.age = age;
        this.name = name;
    }

    public String toString(){
        return "Student [age=" + age + ", name=" + name + "]";
    }

    public int compareTo(Student that){
        if(this.age > that.age){
            return 1;
        }
        else return -1;
    }    
}


public class ComparableDemo {
    public static void main(String[] args) {
        List<Student> studs = new ArrayList<>();

        studs.add(new Student(21,"Abhishek"));
        studs.add(new Student(20,"Vishal"));
        studs.add(new Student(18,"John"));
        studs.add(new Student(12,"Shree"));

        Collections.sort(studs);

        for(Student s : studs){
            System.out.println(s);
        }
    }
}
