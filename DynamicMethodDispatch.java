class A{
    public void show(){
        System.out.println("Inside A show");
    }
}

class B extends A{
    public void show(){
        System.out.println("Inside B show");
    }
}

class C extends A{
    public void show(){
        System.out.println("Inside C show");
    }
}


public class DynamicMethodDispatch {
    public static void main(String args[]){
        A obj = new A(); // A class object
        obj.show(); // A class show method

        obj = new B(); // B class object
        obj.show(); // B class show method

        obj = new C(); // C class object
        obj.show(); // C class show method
    }
}
