package DSA.BasicRecursion;

import java.util.Scanner;

class Solution{
    public int fact(int n){
        if(n == 0 || n == 1) return 1;

        return n * fact(n-1);
    }
}

public class Factorial{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");

        int n = sc.nextInt();
        Solution s = new Solution();

        System.out.println(s.fact(n));

        sc.close();
    }
}