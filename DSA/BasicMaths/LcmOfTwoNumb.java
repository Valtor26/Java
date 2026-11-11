package DSA.BasicMaths;

import java.util.Scanner;

class Solution{
    public int gcd(int a,int b){
        while(a != 0 && b != 0){
            if(a < b) b = b%a;
            else a = a%b;
        }
        return (a == 0) ? b : a;
    }

    public int lcm(int a,int b, int gcd){
        return ((a * b)/gcd);
    }
}

public class LcmOfTwoNumb {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = sc.nextInt();
        System.out.println("Enter b: ");
        int b = sc.nextInt();

        Solution s = new Solution();

        int gcd = s.gcd(a, b);

        System.out.println("The lcm is: " + s.lcm(a, b, gcd));
    }
}
