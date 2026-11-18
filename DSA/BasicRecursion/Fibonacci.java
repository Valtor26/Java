package DSA.BasicRecursion;

import java.util.Scanner;

class Solution{
    public int fib(int n){
        if(n == 0 || n == 1) return n;

        return fib(n-1) + fib(n-2);
    }
}

public class Fibonacci {
    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           System.out.print("Enter n: ");

           int n = sc.nextInt();

           Solution s = new Solution();

           System.out.println(s.fib(n));
    }
}
