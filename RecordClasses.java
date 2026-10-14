/*
    A record class is a special kind of class introduced in Java 16 that makes it easier to create classes whose main purpose is to store data.

Normally, you write fields, a constructor, getters, and methods like toString(), equals(), and hashCode() yourself. A record automatically provides most of these.


Important properties of records
- Immutable component fields: The generated fields are private final, so you cannot reassign them after construction.
- Constructor generated automatically: new Student("Rahul", 22) initializes the record.
- Useful methods generated automatically: toString(), equals(), and hashCode().
- Cannot extend another class: A record implicitly extends java.lang.Record.
- Can implement interfaces: Records can implement interfaces and can contain additional methods and constructors.
*/




/* 
class Student {
    private final String name;
    private final int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String name() {
        return name;
    }

    public int age() {
        return age;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + age;
        return result;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Student other = (Student) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (age != other.age)
            return false;
        return true;
    }
}
*/

record Student(String name,int age){}; 


public class RecordClasses {
    public static void main(String[] args) {
        Student s1 = new Student("Abhishek",23);
        Student s2 = new Student("Abhishek",23);
        System.out.println(s1.equals(s2));
    }
}
