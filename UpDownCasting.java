class A{
    public void showA(){
        System.out.println("Inside A showA");
    }
}

class B extends A{
    public void showB(){
        System.out.println("Inside B showB");
    }
}


public class UpDownCasting {
    public static void main(String[] args) {
        A obj = (A) new B(); // Upcasting
        obj.showA();

        B obj1 = (B) obj; // Downcasting
        obj1.showB();
    }
}
