package CollectionFramework;

import java.util.Stack;

public class LearnStack {
    public static void main(String[] args) {
        Stack<String> names = new Stack<>();

        names.push("Abhishek");
        names.push("Vishal");
        names.push("Anup");
        names.push("Deepa");

        System.out.println(names.peek()); // get the top element

        
        names.pop(); // remove the top element
        System.out.println(names.peek());

    }
}
