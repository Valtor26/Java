class Person{
    private String name;
    private int age;

    // constructor method
    // parameterized constructor method
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    // default constructor method
    public Person(){
        this.name = "Unknown";
        this.age = 0;
    }

    // constructor overloading is a technique in Java in which a class can have more than one constructor that differ in parameter lists. It is similar to method overloading. In other words, multiple constructors with different parameter lists can be defined for a class.

    public Person(String name){
        this.name = name;
        this.age = 0;
    }
    
    public Person(int age){
        this.name = "Unknown";
        this.age = age;
    }

    public void setName(String name){ // setter method
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getName(){ // getter method
        return name;
    }

    public int getAge(){
        return age;
    }

}

// Encapsulation is a process of wrapping code and data together into a single unit. In encapsulation, the variables or data of a class are hidden from other classes and can be accessed only through the methods of their current class. Therefore, it is also known as data hiding.


public class Encapsulation {
    public static void main(String args[]){
        Person pObj = new Person("Abhishek", 23);

        System.out.println(pObj.getName());
        System.out.println(pObj.getAge());

        Person pObj2 = new Person();

        System.out.println(pObj2.getName());
        System.out.println(pObj2.getAge());
    }
}
