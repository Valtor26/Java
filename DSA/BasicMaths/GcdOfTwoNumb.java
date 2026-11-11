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
}

public class GcdOfTwoNumb{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = sc.nextInt();
        System.out.println("Enter b: ");
        int b = sc.nextInt();

        Solution s = new Solution();

        System.out.println("The gcd is: " + s.gcd(a, b));
    }
}