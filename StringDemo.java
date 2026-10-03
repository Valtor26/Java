public class StringDemo {
    public static void main(String args[]){

        // In Java, String is an immutable class that is used to create a String object. It is a thread-safe class and can be used in multi-threaded applications.

        // Every string is created newly on the heap memory and the old string is discarded. This is because strings are immutable in Java.
        // For example, if we create a string "Hello" and then change it to "Hello World", the old string "Hello" is discarded and a new string "Hello World" is created on the heap memory.
        
        String str = new String("Hello World");
        System.out.println(str + " its Java");
        System.out.println(str.charAt(0)); // returns the first character of the string
    }
}