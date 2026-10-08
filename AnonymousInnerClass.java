abstract class A{
    public abstract void show();
}

public class AnonymousInnerClass {
    public static void main(String[] args) {
        A obj = new A(){
            public void show(){
                System.out.println("Inside AnonymousInnerClass show");
            }
        };
        obj.show();
    }
}
