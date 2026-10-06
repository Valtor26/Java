class Human{
    String name;
    int age;

    public Human(String name, int age){
        this.name = name;
        this.age = age;
        System.out.println("Base constructor is called");
    }

    public void show(){
        System.out.println(name + " : " + age);
    }
}
class Student extends Human{
    String course;

    public Student(String name, int age, String course){
        super(name, age); // calling the constructor of the base class Human
        this.course = course;
        System.out.println("Child constructor is called");
    }

    public void show(){
        super.show(); // calling the show method of the base class Human
        System.out.println(course);
    }
}


public class Inheritance {
    public static void main(String[] args) {
        Student s1 = new Student("John", 20, "Computer Science");
        s1.show();
    }
}
