// Functional interface: an interface that has only one abstract method

@FunctionalInterface
interface A{
    void show();
}


public class FunctionalIntface {
    public static void main(String[] args) {
        A obj = new A(){
            @Override
            public void show(){
                System.out.println("Inside show");
            }
        };

        obj.show();
    }
}
