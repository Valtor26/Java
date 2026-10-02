class Calculator{
    public int add(int a, int b){ // add method takes two integers as input and returns their sum
        return a + b;
    }

    public int addThreeNumbers(int a, int b, int c){ // method overloading: same method name but different parameters and parameter types
        return a + b + c;
    }

    public int subtract(int a, int b ){
        return a - b;
    } 
    public int multiply(int a, int b){
        return a * b;
    }
    public int divide(int a, int b){
        return a / b;
    }
    public int modulus(int a, int b){
        return a % b;
    }

}

public class Object {
    public static void main(String args[]){
        Calculator c = new Calculator(); // create a new object of type Calculator
        System.out.println(c.add(10, 20));
        System.out.println(c.addThreeNumbers(10, 20, 30));
    }
}



// all methods have their own stack frame and they are stored in the stack memory. When a method is called, a new stack frame is created for that method and all its local variables are stored in that stack frame. When the method returns, the stack frame is removed from the stack. 

// instance variables are stored in the heap memory and they are created when an object is created. When the object is no longer referenced, it becomes eligible for garbage collection and the memory occupied by the object is freed.

