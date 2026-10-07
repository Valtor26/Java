class A{
    public char[] marks;
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
        this(); // calling current class constructor without any parameter
        System.out.println("In B int constructor");
    }
}


public class ThisConstructor {
    public static void main(String[] args) {
         B obj = new B(5);
    }
}
