public class Operators {
    public static void main(String args[]){

        // Arithmetic Operators
        int a = 10;
        int b = 20;
        int c = a + b;
        int d = a - b;
        int e = a * b;
        int f = a / b;
        int g = a % b;

        System.out.println("Sum of a and b is: " + c);
        System.out.println("Difference of a and b is: " + d);
        System.out.println("Product of a and b is: " + e);
        System.out.println("Quotient of a and b is: " + f);
        System.out.println("Remainder of a and b is: " + g);   


        // Relational Operators
        int x = 10;
        int y = 20;
        boolean i = (x < y);
        boolean j = (x > y);
        boolean k = (x <= y);
        boolean l = (x >= y);
        boolean m = (x == y);
        boolean n = (x != y);

        System.out.println("x is less than y: " + i);
        System.out.println("x is greater than y: " + j);
        System.out.println("x is less than or equal to y: " + k);
        System.out.println("x is greater than or equal to y: " + l);
        System.out.println("x is equal to y: " + m);
        System.out.println("x is not equal to y: " + n);


        // Logical Operators

        boolean o = true;
        boolean p = false;
        
        boolean q = o && p;
        boolean r = o || p;
        boolean s = !o;


        System.out.println("o AND p is: " + q);
        System.out.println("o OR p is: " + r);
        System.out.println("NOT o is: " + s);
    }
}
