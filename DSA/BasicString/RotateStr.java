package DSA.BasicString;

import java.util.Scanner;

class Solution{
    public boolean rotate(String s, String goal){
        if(s.length() != goal.length()) return false;

        String concat = s + s;
        

        return concat.contains(goal);
    }
}

public class RotateStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();

        System.out.print("Enter goal: ");
        String goal = sc.nextLine();

        Solution sol = new Solution();

        System.out.println(sol.rotate(s, goal) ? "True" : "False");

    }
}