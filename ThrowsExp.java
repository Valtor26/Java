/*
    Throws: throwing an exception from a method, the calling method must have a try-catch block to handle the exception 
*/

class A{
    public void show() throws ClassNotFoundException{
        Class.forName("Calcccc");
    }
}


public class ThrowsExp {
    public static void main(String[] args) {
        A obj = new A();
        try{
            obj.show();
        }
        catch(ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
