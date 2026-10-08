// interface: all the methods in a interface are public abstract by default, it only gives you the definition, a class must implement all the abstract methods of an interface using implements keyword

// all the variables in an interface are final and static by default

interface A{
    int a = 10;
    String b = "Hello";

    void show();
    void config();
}

interface X{
    void run();
}

interface Y extends X{
    void fly();
}

class B implements A,Y{ // a class can implement multiple interfaces
    public void show(){
        System.out.println("Inside B show");
    }

    public void config(){
        System.out.println("Inside B config");
    }

    public void run(){
        System.out.println("Inside B run");
    }
    public void fly(){
        System.out.println("Inside B fly");
    }
}


public class InterfaceDemo {
    public static void main(String[] args) {

        System.out.println(A.a);

        A obj = new B();
        obj.show();
        obj.config();

        Y obj1 = (Y) obj;
        obj1.run();
        obj1.fly();
        
    
    }
}
