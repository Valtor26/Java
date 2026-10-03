public class StringBufferDemo {
    public static void main(String args[]){

        // In Java, StringBuffer is a mutable class that is used to create a String object. It is not a thread-safe class and should not be used in multi-threaded applications.

        StringBuffer sb = new StringBuffer("Abhishek"); // create a StringBuffer object

        sb.append(" Kiran"); // append a string to the StringBuffer object

        System.out.println(sb); // print the StringBuffer object


        String str = sb.toString(); // convert the StringBuffer object to a String object
        System.out.println(str); // print the String object
    }
}
