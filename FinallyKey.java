/*
    Finally block is used to execute code after the try block even if the try block throws an exception. 
    The finally block is always executed, even if the try block throws an exception.

    Finally block is used to release resources, close files, etc.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FinallyKey {
    public static void main(String[] args) throws IOException {
        int num = 0;
        BufferedReader bf = null;
        try{
            InputStreamReader in = new InputStreamReader(System.in);
             bf = new BufferedReader(in);

            num = Integer.parseInt(bf.readLine());

            System.out.println("You entered " + num);
        }
        finally{
            bf.close();
            System.out.println("Finally block executed");
        }
    }
}
