package DSA.Patterns;

import java.util.Scanner;

public class Pattern17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");

        int n = sc.nextInt();

        for(int i=0;i<n;i++){
            char ch = 'A';
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int j=0;j<(2*i)+1;j++){
                if(j < i) System.out.print(ch++);
                else System.out.print(ch--);
            }
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }

            System.out.println();
        }
    }
}
