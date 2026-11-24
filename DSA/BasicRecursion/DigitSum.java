package DSA.BasicRecursion;

import java.util.Scanner;

class Solution{
    public int getSum(int n){
        if(n < 10) return n;

        int digitSum = 0;

        while(n > 0){
            digitSum += n%10;
            n /= 10;
        }

        return getSum(digitSum);
    }
}

public class DigitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");

        int n = sc.nextInt();
        sc.nextLine();

        Solution s = new Solution();

        System.out.println(s.getSum(n));
    }
}
