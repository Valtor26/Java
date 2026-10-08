class A{
    int age;

    public void show(){
        System.out.println("Inside A show");
    }

    class B{
        public void config(){
            System.out.println("Inside B config");
        }
    }

    static class C{
        public void print(){
            System.out.println("Inside C print");
        }
    }
}


public class InnerClass {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();

        A.B obj1 = obj.new B();
        obj1.config();

        A.C obj2 = new A.C(); // static inner class
        obj2.print();
    }
}
