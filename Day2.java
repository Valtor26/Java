
//-------------------------------------------------------------------------->


// type casting is a process of converting one data type to another. 

//Type casting is performed manually by the programmer, usually when converting a larger data type into a smaller one.

public class Day2 {
    public static void main(String[] args) {
        double value = 25.89;
        int num = (int) value;

        System.out.println(value); // 25.89
        System.out.println(num);   // 25
    }
}

//Here, (int) explicitly converts the double to an int. The decimal portion is discarded.

//----------------------------------------------------------------->

// type conversion is a process of converting one data type to another. In Java, type conversion is done explicitly by the programmer. For example, if we assign an integer value to a byte variable, the value will not be automatically converted to a byte.

//Type conversion happens automatically when a smaller data type is converted into a larger compatible data type.

// Order:
// byte → short → int → long → float → double

public class Day2 {
    public static void main(String[] args) {
        int num = 25;
        double value = num;   // automatic conversion

        System.out.println(num);    // 25
        System.out.println(value);  // 25.0
    }
}

//Here, int is automatically converted to double. Usually, there is no loss of magnitude/range, although some widening conversions such as long to float can lose precision.

// type promotion is a process of converting a smaller data type to a larger data type. In Java, type promotion is done automatically by the compiler. For example, if we assign a byte value to an int variable, the value will be automatically promoted to an int.



//Type promotion is the process where Java automatically promotes smaller data types to a larger type when performing an operation, especially arithmetic operations.

byte a = 10;
byte b = 20;

int result = a + b;

System.out.println(result); // 30

//You might expect a + b to produce a byte, but Java promotes both byte values to int. This is because the + operator is defined for int, and the compiler automatically promotes the smaller type to the larger type.


