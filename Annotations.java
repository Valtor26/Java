class A{
    public void method(){
        System.out.println("Hello");
    }
}

class B extends A{
    @Override 
    public void method(){
        System.out.println("Hello from B");
    }
}


public class Annotations {
    public static void main(String[] args) {
        B obj = new B();

        obj.method();
    }
}
