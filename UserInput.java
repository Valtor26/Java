import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter your name: ");

        InputStreamReader in = new InputStreamReader(System.in); //converts bytes from an input stream into characters.
        BufferedReader bf = new BufferedReader(in);

        String name = bf.readLine(); // reads characters efficiently by buffering them and provides the convenient readLine() method.

        System.out.println("Hello " + name);







        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age: ");

        int age = sc.nextInt();

        System.out.println("Your age is " + age);

        sc.close();
    }
}