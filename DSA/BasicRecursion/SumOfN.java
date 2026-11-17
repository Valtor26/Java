package DSA.BasicRecursion;

import java.util.Scanner;

class Solution{
    public int findSum(int n){
        if(n == 0) return 0;
        
        return n + findSum(n-1);
    }
}

public class SumOfN{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");

        int n = sc.nextInt();

        Solution s = new Solution();

        System.out.println(s.findSum(n));

        sc.close();
    }
}