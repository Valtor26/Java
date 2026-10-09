/*
    Exceptions: Exceptions are runtime errors that occur during the execution of a program, they are used to handle errors and exceptional situations in a program.

    There are 3 types of errors:

    1. Compile-time errors: these are errors that occur during the compilation of the program
    2. Run-time errors: these are errors that occur during the execution of the program
    3. Logical errors: these are errors that occur during the execution of the program, also known as programming errors/ bugs



    Without exception handling, the program will terminate as soon as an exception occurs, and stops executing the code after that.
*/

public class ExceptionsDemo {
    public static void main(String[] args) {
        int a = 2;
        int b = 0;

        int arr[] = new int[5];

        String name = null;

        try{ // try block: this tries to execute the code inside the try block, if an exception occurs, it jumps to the catch block
            b = 18/a;
            System.out.println(name.length());
            System.out.println(arr[0]);
            System.out.println(arr[4]);
        }
        catch(ArithmeticException e){
            System.out.println("Division by zero: " + e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Index out of bounds: " + e);
        }
        catch(NullPointerException e){
            System.out.println("Null pointer: " + e);
        }
        catch(Exception e){
            System.out.println("Exception: " + e);
        }

        System.out.println(b);

        System.out.println("Hello");
    }
}
