package DSA.BasicMaths;

import java.util.Scanner;

public class CheckNumbPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");

        int n = sc.nextInt();
        int dup = n;
        int revNumb = 0;
        while(n > 0){
            int lastDig = n%10;
            revNumb = (revNumb * 10) + lastDig;
            n = n/10;
        }
        if(revNumb == dup) System.out.println("True");
        else System.out.println("False");
    }
}
