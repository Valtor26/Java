package DSA.Patterns;

import java.util.Scanner;

public class Pattern15 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");

        int n = sc.nextInt();

        for(int i=0;i<n;i++){
            char ch = 'A';
            for(int j=n-i-1;j>=0;j--){
                System.out.print(ch+" ");
                ch+=1;
            }
            System.out.println();
        }
    }
}
