// final class

// final class Calc{ // we cannot extend this class because it is declared as final
//     public void show(){
//         System.out.println("Inside Calc Show");
//     }

//     public void add(int a,int b){
//         System.out.println("Addition: "+(a+b));
//     }
// }

// class AdvCalc extends Calc{ // this will give an error because we cannot extend a final class

// }



// Final method

class Calc{ // we cannot extend this class because it is declared as final
    public final void show(){ // restricts the method from being overridden in the child class
        System.out.println("Inside Calc Show by Abhishek");
    }

    public void add(int a,int b){
        System.out.println("Addition: "+(a+b));
    }
}

class AdvCalc extends Calc{ // this will give an error because we cannot extend a final class
    // public void show(){ // restricts the method from being overridden in the child class
    //     System.out.println("Inside AdvCalc Show by Vishal");
    // }
}


public class FinalKey {
    public static void main(String[] args) {

        // final variable:

        // final int a = 10; // we cannot change the value of a because it is declared as final, it acts as a constant
        // a = 20; // this will give an error

        // final method:

        AdvCalc obj = new AdvCalc();

        obj.show();


    }
}
