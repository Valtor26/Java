class A{
    public A(){
        super();
        System.out.println("In A constructor");
    }
    public A(int n){
        super();
        System.out.println("In A int constructor");
    }
}

class B extends A{
    public B(){
        super(); // calling super class constructor without any parameter
        System.out.println("In B constructor");
    }
    public B(int n){
        super(n); // calling super class constructor with int parameter
        System.out.println("In B int constructor");
    }
}


public class SuperKey {
    public static void main(String[] args) {
         B obj = new B(5);
    }
}
