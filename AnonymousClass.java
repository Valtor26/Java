class A{
    public void show(){
        System.out.println("Inside A show");
    }
}

public class AnonymousClass {
    public static void main(String[] args) {
        A obj = new A(){
            public void show(){
                System.out.println("Inside AnonymousClass show");
            }
        };
        obj.show();
    }
}
