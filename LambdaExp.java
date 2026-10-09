// lambda expression: an anonymous function

// Functional interface: an interface that has only one abstract method

// Lambda expression work only with functional interfaces

// @FunctionalInterface
// interface A{
//     void show(int num);
// }


@FunctionalInterface 
interface Calc{
    int add (int a, int b);
}






public class LambdaExp {
        public static void main(String[] args) {

        //     A obj = new A(){
        //     @Override
        //     public void show(){
        //         System.out.println("Inside show");
        //     }
        // };

        // A obj = (n) -> { // lambda expression
        //         System.out.println("Inside show " + n);
        //     }
        // ;

        // obj.show(26);



        Calc cObj = (a, b) -> a + b; // lambda expression
        

        int res = cObj.add(10, 20);
        System.out.println(res);
    }
}
