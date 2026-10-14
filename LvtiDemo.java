/*
    LVTI: Local Variable Type Inference, its a feature of Java that allows us to infer the type of a variable at compile time.
*/




import java.util.ArrayList;

class Student{

}

public class LvtiDemo {
    public static void main(String[] args) {
        int a = 10;
        var b = 20;

        var stud1 = new Student();

        // var c; // as per java rules, this is not allowed, we must initialize it 

        var arr = new int[10];


        var nums = new ArrayList<Integer>();
        
    }
}
