// Abstract class cannot be instantiated, an abstract class can only be extended

// a class should be abstract if it has at least one abstract method

// an abstract class can have abstract methods and non-abstract methods, or only abstract methods

// abstract methods of a abstract class must be implemented in the child class

// we can create object of a concrete class, but we cannot create object of an abstract class


abstract class Car{
    public abstract void drive();

    public abstract void fly();

    public void playMusic(){
        System.out.println("Inside playMusic");
    }
}

abstract class Swift extends Car{
    public void drive(){ // if not all abstract methods are implemented in the child class, then the child class must be abstract
        System.out.println("Inside drive");
    }
}

class Swiftyy extends Swift{ // concrete class: child class of abstract class
    public void fly(){ 
        System.out.println("Inside fly");
    }
}

public class AbstractKey {
    public static void main(String[] args) {
        // Car c1 = new Car(); // we cannot instantiate abstract class

        Car obj = new Swiftyy();
        obj.drive();
        obj.playMusic();
        obj.fly();
    }
}
