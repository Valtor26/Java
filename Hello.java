
// Java is platform independent because it can run on any operating system without modification. This is achieved through the use of bytecode, which is an intermediate representation of the Java code that can be executed by the Java Virtual Machine (JVM) on any platform. But JVM is platform dependent because it is written in Java and needs to be compiled and run on the specific platform.

// Code (.java) --> Compiler (javac) --> Bytecode (.class) ----> JVM (Java Virtual Machine) --> JVM looks for main method and executes it.

// JRE (Java Runtime Environment) is a software package that provides the necessary libraries and components to run Java applications. It includes the JVM, core libraries, and other resources needed to execute Java programs. The JRE is platform-dependent because it is designed to work with a specific operating system and architecture.

// JDK (Java Development Kit) is a software development kit that provides tools and resources for developing Java applications. It includes the JRE, as well as additional tools such as the Java compiler (javac), debugger, and other utilities. The JDK is also platform-dependent because it is designed to work with a specific operating system and architecture.

class Hello{
    public static void main(String a[]) {
        int x = 10;
        int y = 16;
        byte b = 127; // byte is a signed integer type that can store values from -128 to 127
        short s = 32767; // short is a signed integer type that can store values from -32768 to 32767
        char c = 'A'; // char is a single-character string type
        double z = 3.14;
        long l = 1000000000l;
        boolean bool = true; // boolean is a logical type that can store either true or false   
        float f = 3.14f;
        System.out.println("Sum of x and y is: " + (x + y));
        System.out.println("Sum of x, y and z is: " + (x + y + z));
        System.out.println("Sum of x, y, z and l is: " + (x + y + z + l));
        System.out.println("Sum of x, y, z and f is: " + (x + y + z + f));
    }
}