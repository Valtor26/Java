import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student{
    int age;
    String name;

    public Student(int age, String name){
        this.age = age;
        this.name = name;
    }

    public String toString(){
        return "Student [age=" + age + ", name=" + name + "]";
    }
}



public class ComparatorOnClass {
    public static void main(String[] args) {

        // Comparator<Student> comp = new Comparator<Student>() {
        //     public int compare(Student s1, Student s2) {
        //         if(s1.age > s2.age){
        //             return 1;
        //         }
        //         else return -1;
        //     }
        // };


        Comparator<Student> comp = (s1,s2) -> s1.age > s2.age ? 1 : -1; // lambda expression because Comparator is functional interface




        List<Student> studs = new ArrayList<>();

        studs.add(new Student(21,"Abhishek"));
        studs.add(new Student(20,"Vishal"));
        studs.add(new Student(18,"John"));
        studs.add(new Student(12,"Shree"));


        Collections.sort(studs,comp);

        for(Student s : studs){
            System.out.println(s);
        }
    }
}
